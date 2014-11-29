package jpa.springInt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENCY")
public class Agency {
	
	@Id
	@Column(name = "AGENCY_ID")
	private int agencyId;
	
	@Column(name = "NAME")
	private String name;
	


	@Column(name = "LOCATION_AREA")
	private String loacationArea;
	
	public int getAgencyId() {
		return agencyId;
	}

	public void setAgencyId(int agencyId) {
		this.agencyId = agencyId;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLoacationArea() {
		return loacationArea;
	}

	public void setLoacationArea(String loacationArea) {
		this.loacationArea = loacationArea;
	}



	@Override
	public String toString() {
		return "Agency [agencyId=" + agencyId + ", name=" + name
				+ ", loacationArea=" + loacationArea + "]";
	}
}
