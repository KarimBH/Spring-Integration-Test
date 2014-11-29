package test.springInt;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import javax.xml.transform.Source;

import org.apache.log4j.Logger;
import org.junit.Test;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.xml.transform.StringResult;
import org.springframework.xml.transform.StringSource;

/**
 * System tests ensuring the Spring WS MessageDispatcherServlet is correctly
 * set up and configured to delegate incoming requests to our ws:inbound-gateway.
 *
 * Use 'mvn package' to create a war file for this project, then deploy before
 * attempting to run this test.
 *
 * @author Chris Beams
 */
public class InContainerTests {

	private static Logger logger = Logger.getLogger(InContainerTests.class);
	private static final String WS_URI = "http://localhost:8080/SpringIntTest/echoService";
	private static final String WS_URI2 = "http://localhost:8080/SpringIntTest/searchCarService/search";

	private final WebServiceTemplate template = new WebServiceTemplate();

	@Test
	public void testWebServiceRequestAndResponse() {
		StringResult result = new StringResult();
		Source payload = new StringSource(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<echoRequest xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">hello</echoRequest>");

		Source payload2 = new StringSource(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<searchCar xmlns=\"http://www.springframework.org/spring-ws/samples/searchCar\"> "
				+ "<CarBrand> attr1 </CarBrand>"
				+ "<CarName> attr2 </CarName>"
				+ "</searchCar>");

		
		template.sendSourceAndReceiveToResult(WS_URI2, payload2, result);
		logger.info("RESULT: " + result.toString());
		assertThat(result.toString(), equalTo(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
				"<echoResponse xmlns=\"http://www.springframework.org/spring-ws/samples/echo\">hello</echoResponse>"));
	}
}