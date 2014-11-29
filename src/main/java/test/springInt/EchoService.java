package test.springInt;

import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;

import org.springframework.integration.xml.source.DomSourceFactory;

public class EchoService {

	public Source issueResponseFor(DOMSource request) {
		return new DomSourceFactory()
				.createSource("<echoResponse xmlns=\"http://springInt/echo\">"
						+"Echo Service"
						+request.getNode().getTextContent()
						+ "</echoResponse>");
	}
}
