
package localhost._8080.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8080.schema package. 
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

    private final static QName _SearchCarResponse_QNAME = new QName("http://localhost:8080/schema", "searchCarResponse");
    private final static QName _EchoResponse_QNAME = new QName("http://localhost:8080/schema", "echoResponse");
    private final static QName _EchoRequest_QNAME = new QName("http://localhost:8080/schema", "echoRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8080.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchCarRequest }
     * 
     */
    public SearchCarRequest createSearchCarRequest() {
        return new SearchCarRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/schema", name = "searchCarResponse")
    public JAXBElement<String> createSearchCarResponse(String value) {
        return new JAXBElement<String>(_SearchCarResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/schema", name = "echoResponse")
    public JAXBElement<String> createEchoResponse(String value) {
        return new JAXBElement<String>(_EchoResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/schema", name = "echoRequest")
    public JAXBElement<String> createEchoRequest(String value) {
        return new JAXBElement<String>(_EchoRequest_QNAME, String.class, null, value);
    }

}
