package test.springInt;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import javax.xml.transform.Source;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

public class InContainerTest {

	private static Logger logger = Logger.getLogger(InContainerTests.class);
	private static final String WS_URI = "http://localhost:8081/SpringIntTest/echoService/echo";
	private static final String WS_URI2 = "http://localhost:8081/SpringIntTest/searchCarService/searchCar";
	private static final String WS_URI3 = "http://localhost:8081/SpringIntTest/addBookingService/addBooking";

	private final WebServiceTemplate template = new WebServiceTemplate();

	@Test
	public void testWebServiceRequestAndResponse() {
		StringResult result = new StringResult();
		Source payload = new StringSource(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
						+ "<echoRequest xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">hello</echoRequest>");

		Source payload2 = new StringSource(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
						+ "<searchCar xmlns=\"http://www.springframework.org/spring-ws/samples/searchCar\"> "
						+ "<CarBrand>marque2</CarBrand>"
						+ "<CarName>modele22</CarName>" + "</searchCar>");

		Source payload3 = new StringSource(

//		 "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
//		 +
//		 "<addBooking xmlns=\"http://www.springframework.org/spring-ws/samples/searchCar\"> "+
				"<Booking>" + "<BookingNumber>bookTest</BookingNumber>"
						+ "<customerId>15</customerId>"
						+ "<agencyId>12</agencyId>" + "<carId>car007</carId>"
						+ "<bookingDate>2014-07-22</bookingDate>"
						+ "<returnDate>2014-07-28</returnDate>" + "</Booking>"
//		 + "</addBooking>"
		);

		String echoExpectedResponse = "<echoResponse xmlns=\"http://springInt/echo\">true</echoResponse>";
		String addBookingExpectedResponse = "<addBookingResponse xmlns=\"http://springInt/addBooking\">"
				+ "true"
				+ "</addBookingResponse>";
		String searchCarExpectedResponse = "<searchCarResponse xmlns=\"http://springInt/searchCar\">"
				+ "[{AGENCY_ID=11}, {AGENCY_ID=31}]"
				+ "</searchCarResponse>";
		try {
			template.sendSourceAndReceiveToResult(WS_URI3, payload3, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertThat(result.toString(),
				equalTo("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"+echoExpectedResponse));
	}
}