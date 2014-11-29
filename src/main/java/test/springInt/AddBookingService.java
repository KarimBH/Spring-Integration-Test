package test.springInt;

import java.util.Random;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import jpa.springInt.entities.Booking;
import jpa.springInt.test.BookingServices;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.xml.source.DomSourceFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.PollableChannel;
import org.springframework.messaging.support.MessageBuilder;

public class AddBookingService {

	private Booking booking;
	private ClassPathXmlApplicationContext context;
	private MessageChannel unmarshallchannel;
	private PollableChannel outChannel;
	private BookingServices bookingService;

	public Source issueResponseFor(DOMSource request) {

		try {
			setSpringContextAndGetBeans("classpath:/META-INF/spring/integration/globalConf/spring-integration-globalContext.xml");

			// setBooking(request);
			booking = new Booking();
			booking = unmarshallRequest(request);

			System.out.println(booking);
			bookingService.addBooking(booking);

			return createResponseSource(true);
		} catch (Exception e) {
			e.printStackTrace();
			return createResponseSource(false);
		} finally {
			context.close();
		}

	}

	private void setSpringContextAndGetBeans(String classPath) {

		context = new ClassPathXmlApplicationContext(classPath);

		unmarshallchannel = context.getBean("UnmarshallRequest-channel",
				MessageChannel.class);

		outChannel = (PollableChannel) context.getBean(
				"UnmarshallResponse-channel", PollableChannel.class);

		bookingService = (BookingServices) context.getBean("bookingServices");
	}

	private Source createResponseSource(Boolean response) {
		return new DomSourceFactory()
				.createSource("<addBookingResponse xmlns=\"http://springInt/addBooking\">"
						+ response + "</addBookingResponse>");
	}

	private Booking unmarshallRequest(DOMSource domSource) {

		// sending DOMSource booking to be transformed to a POJO
		Message<DOMSource> sourceRequestMessage = MessageBuilder.withPayload(
				domSource).build();
		unmarshallchannel.send(sourceRequestMessage);
		Booking bk = (Booking) outChannel.receive().getPayload();
		bk.setBookingNumber("book" + getRandomID());
		return bk;

	}

	private int getRandomID() {
		Random randomGenerator = new Random();
		return randomGenerator.nextInt(100);
	}
}
