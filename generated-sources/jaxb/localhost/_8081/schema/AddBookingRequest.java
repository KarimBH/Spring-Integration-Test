
package localhost._8081.schema;

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
 *         &lt;element name="bookingNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="agencyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="carId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bookingDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "bookingNumber",
    "customerId",
    "agencyId",
    "carId",
    "bookingDate",
    "returnDate"
})
@XmlRootElement(name = "addBookingRequest")
public class AddBookingRequest {

    @XmlElement(required = true)
    protected String bookingNumber;
    protected int customerId;
    protected int agencyId;
    @XmlElement(required = true)
    protected String carId;
    @XmlElement(required = true)
    protected String bookingDate;
    @XmlElement(required = true)
    protected String returnDate;

    /**
     * Gets the value of the bookingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNumber() {
        return bookingNumber;
    }

    /**
     * Sets the value of the bookingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingNumber(String value) {
        this.bookingNumber = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     */
    public int getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     */
    public void setAgencyId(int value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the carId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarId(String value) {
        this.carId = value;
    }

    /**
     * Gets the value of the bookingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingDate() {
        return bookingDate;
    }

    /**
     * Sets the value of the bookingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingDate(String value) {
        this.bookingDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

}
