//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.08.21 at 12:30:56 PM GMT+01:00 
//


package localhost._8080.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarBrand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CarName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carBrand",
    "carName"
})
@XmlRootElement(name = "searchCarRequest")
public class SearchCarRequest {

    @XmlElement(name = "CarBrand", required = true)
    protected String carBrand;
    @XmlElement(name = "CarName", required = true)
    protected String carName;

    /**
     * Gets the value of the carBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * Sets the value of the carBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarBrand(String value) {
        this.carBrand = value;
    }

    /**
     * Gets the value of the carName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarName() {
        return carName;
    }

    /**
     * Sets the value of the carName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarName(String value) {
        this.carName = value;
    }

}