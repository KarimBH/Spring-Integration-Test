package jpa.springInt.test;

import java.util.List;

import org.springframework.integration.annotation.Payload;
import org.springframework.stereotype.Service;

import jpa.springInt.entities.Booking;
@Service
public interface BookingServices {
	
	
	Booking addBooking(Booking booking);

	@Payload("new java.util.Date()")
	List<Booking> findBookings();
}
