package jpa.springInt.test;

import java.util.List;

import org.springframework.integration.annotation.Payload;
import org.springframework.stereotype.Service;

import jpa.springInt.entities.CarType;
@Service
public interface CarTypeServices {
	
	
	CarType addCarType(CarType carType);

	@Payload("new java.util.Date()")
	List<CarType> findCarTypes();
}
