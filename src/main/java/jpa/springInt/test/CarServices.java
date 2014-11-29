package jpa.springInt.test;

import java.util.List;

import org.springframework.integration.annotation.Payload;
import org.springframework.stereotype.Service;

import jpa.springInt.entities.Car;
@Service
public interface CarServices {
	
	
	Car addCar(Car car);

	@Payload("new java.util.Date()")
	List<Car> findCars();
}
