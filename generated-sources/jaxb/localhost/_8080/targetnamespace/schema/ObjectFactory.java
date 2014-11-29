
package localhost._8080.targetnamespace.schema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the localhost._8080.targetnamespace.schema package. 
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

    private final static QName _Operation2Request_QNAME = new QName("http://localhost:8080/targetNameSpace/schema", "operation2Request");
    private final static QName _Operation2Response_QNAME = new QName("http://localhost:8080/targetNameSpace/schema", "operation2Response");
    private final static QName _Operation1Response_QNAME = new QName("http://localhost:8080/targetNameSpace/schema", "operation1Response");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: localhost._8080.targetnamespace.schema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Operation1Request }
     * 
     */
    public Operation1Request createOperation1Request() {
        return new Operation1Request();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/targetNameSpace/schema", name = "operation2Request")
    public JAXBElement<Short> createOperation2Request(Short value) {
        return new JAXBElement<Short>(_Operation2Request_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/targetNameSpace/schema", name = "operation2Response")
    public JAXBElement<String> createOperation2Response(String value) {
        return new JAXBElement<String>(_Operation2Response_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8080/targetNameSpace/schema", name = "operation1Response")
    public JAXBElement<Boolean> createOperation1Response(Boolean value) {
        return new JAXBElement<Boolean>(_Operation1Response_QNAME, Boolean.class, null, value);
    }

}
