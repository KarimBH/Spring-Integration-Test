package jpa.springInt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.endpoint.PollingConsumer;

public class PayloadPollingConsumer {
	private PollingConsumer consumer = null;
	private XmlHandler xmlHandler = null;

	public  PayloadPollingConsumer(ApplicationContext ctx,
			QueueChannel outChannel) {
		// instance of handler
		xmlHandler = new XmlHandler();
		// now create the framework's consumer
		consumer = new PollingConsumer(outChannel, xmlHandler);
		// You must set the context, or else an error will be thrown
		consumer.setBeanFactory(ctx);
	}

	public void startConsumer() {
		consumer.start();
	}
	public Object getPojo() {
		return xmlHandler.getPojo();
	}
}