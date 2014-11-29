
package localhost._8081.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8081.schema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddBookingResponse_QNAME = new QName("http://localhost:8081/schema", "addBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8081.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddBookingRequest }
     * 
     */
    public AddBookingRequest createAddBookingRequest() {
        return new AddBookingRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8081/schema", name = "addBookingResponse")
    public JAXBElement<Boolean> createAddBookingResponse(Boolean value) {
        return new JAXBElement<Boolean>(_AddBookingResponse_QNAME, Boolean.class, null, value);
    }

}
