package jpa.springInt.test;

import java.util.List;

import org.springframework.integration.annotation.Payload;
import org.springframework.stereotype.Service;

import jpa.springInt.entities.Customer;
@Service
public interface CustomerServices {
	
	
	Customer addCustomer(Customer customer);

	@Payload("new java.util.Date()")
	List<Customer> findCustomers();
}
