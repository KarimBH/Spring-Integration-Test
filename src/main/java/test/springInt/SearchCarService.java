package test.springInt;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

import javax.sql.DataSource;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.xml.source.DomSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * this class is responsible for processing search car operations as it performs
 * an sql query to retreive the id of agencies where the searched car specified
 * in the request is available
 * 
 * @author Karim
 *
 */
public class SearchCarService {
	private String carBrand;
	private String carName;
	private ClassPathXmlApplicationContext context;
	private static Logger logger = Logger.getLogger(SearchCarService.class);
	private JdbcTemplate template;

	private DataSource ds;

	public Source issueResponseFor(DOMSource request) {

		setSpringContextAndGetBeans("classpath:/META-INF/spring/integration/globalConf/spring-integration-globalContext.xml");

		this.setCarSpec(request);

		List<?> result = formAndExecuteSqlQuery();

		logger.debug(">>>>Result of query:" + result.toString());

		return createResponseSource(result.toString());

	}

	/**
	 * Forms the sql query for the car brand and type
	 * 
	 * @return list of agency_ID where the reqested car is available
	 */
	private List<?> formAndExecuteSqlQuery() {
		String query = "select distinct(c.AGENCY_ID)"
				+ " from CAR_TYPE ct, CAR c "
				+ "where c.CAR_TYPE_ID =(select cti.CAR_TYPE_ID from CAR_TYPE cti "
				+ " where (cti.NAME='" + carName + "' and cti.BRAND='"
				+ carBrand + "'))";

		logger.debug("\n Searching for agencies with:\n-carBrand: " + carBrand
				+ "\n" + "-carName: " + carName + "\n SQL query: " + query
				+ "\n");

		template = new JdbcTemplate((javax.sql.DataSource) ds);
		return template.queryForList(query);
	}

	/**
	 * Sets the Spring/Spring Itegration context and gets an instance of the
	 * datasource to perform the sql operation on
	 * 
	 * @param classPath
	 */
	private void setSpringContextAndGetBeans(String classPath) {
		context = new ClassPathXmlApplicationContext(classPath);
		ds = (DataSource) context.getBean("dataSource", DataSource.class);
	}

	/**
	 * Gets the car brand and type from the request source and sets the
	 * attributes
	 * 
	 * @param request
	 */
	private void setCarSpec(DOMSource request) {
		try {
			String stringRequest = DomToString(request);
			logger.debug("Request"+stringRequest);

			DocumentBuilderFactory docFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder;

			docBuilder = docFactory.newDocumentBuilder();
			InputSource is = new InputSource(new StringReader(stringRequest));
			Document doc = docBuilder.parse(is);

			NodeList nodelist = doc.getDocumentElement().getChildNodes();

			logger.debug(">>>>>> Node list length:" + nodelist.getLength()
					+ ":::" + doc.getDocumentElement().getTextContent());
			carBrand = nodelist.item(1).getTextContent();
			carName = nodelist.item(3).getTextContent();

		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * Convert a DomSource to string
	 * 
	 * @param domSource
	 * @return
	 */
	private String DomToString(DOMSource domSource) {
		try {
			Transformer transformer = TransformerFactory.newInstance()
					.newTransformer();
			StreamResult result = new StreamResult(new StringWriter());
			transformer.transform(domSource, result);
			return result.getWriter().toString();
		} catch (TransformerException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	/**
	 * create the appropriate Source response for the request. Errors are
	 * handled automatically by Spring, the response doesn't contain any
	 * indication in case of errors
	 * 
	 * @param response
	 * @return
	 */
	private Source createResponseSource(String response) {
		return new DomSourceFactory()
				.createSource("<searchCarResponse xmlns=\"http://springInt/searchCar\">"
						+ response + "</searchCarResponse>");
	}
}
