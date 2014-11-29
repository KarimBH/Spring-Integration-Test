package jpa.springInt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	private int customerId;

	@Column(name = "LOGIN")
	private String login;

	@Column(name = "PASSWORD")
	private String password;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", login=" + login
				+ ", password=" + password + "]";
	}
	
	
}
