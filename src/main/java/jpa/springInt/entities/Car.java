package jpa.springInt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car {
	
	@Id
	@Column(name = "CAR_ID")
	private String carId;
	
	@Column(name = "CAR_TYPE_ID")
	private int carTypeId;

	@Column(name = "AGENCY_ID")
	private int agencyId;

	@Column(name = "BASE_PRICE_PER_DAY")
	private int basePricePerDay;

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public int getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}

	public int getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}

	public int getBasePricePerDay() {
		return basePricePerDay;
	}

	public void setBasePricePerDay(int basePricePerDay) {
		this.basePricePerDay = basePricePerDay;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carTypeId=" + carTypeId
				+ ", agencyId=" + agencyId + ", basePricePerDay="
				+ basePricePerDay + "]";
	}

}
