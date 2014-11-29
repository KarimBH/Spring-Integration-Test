package jpa.springInt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "addBookingRequest")
@Entity
@Table(name = "BOOKING")
public class Booking {
	
	@Id
	@Column(name = "BOOKING_NUMBER")
	private String BookingNumber;
	
	@Column(name = "CUSTOMER_ID")
	private int customerId;
	
	@Column(name = "AGENCY_ID")
	private int agencyId;
	
	@Column(name = "CAR_ID")
	private String carId;
	
	@Column(name = "BOOKING_DATE")
	private String bookingDate;
	
	@Column(name = "RETURN_DATE")
	private String returnDate;

	public String getBookingNumber() {
		return BookingNumber;
	}

	public void setBookingNumber(String bookingNumber) {
		BookingNumber = bookingNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Booking [BookingNumber=" + BookingNumber + ", customerId="
				+ customerId + ", agencyId=" + agencyId + ", carId=" + carId
				+ ", bookingDate=" + bookingDate + ", returnDate=" + returnDate
				+ "]";
	}

}
