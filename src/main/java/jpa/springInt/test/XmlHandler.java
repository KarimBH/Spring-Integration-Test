package jpa.springInt.test;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;


public class XmlHandler implements MessageHandler {
private Object pojo;

public void handleMessage(Message<?> message) throws MessagingException {
	// TODO Auto-generated method stub
	this.pojo = message.getPayload();
}
public Object getPojo() {
	return pojo;
}
}