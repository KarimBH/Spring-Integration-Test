package jpa.springInt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CAR_TYPE")
public class CarType {

	@Id
	@Column(name = "CAR_TYPE_ID")
	private int carTypeId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "BRAND")
	private String brand;

	public int getCarTypeId() {
		return carTypeId;
	}

	public void setCarTypeId(int carTypeId) {
		this.carTypeId = carTypeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "CarType [carTypeId=" + carTypeId + ", name=" + name
				+ ", brand=" + brand + "]";
	}

}
