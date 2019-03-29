package com.evry.tableperhierarchy;



import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("pcustomer")
public class PartialCustomer extends Customer {

	@Column(name="city")
	private String city;
	
	@Column(name="cjob")
	private String cjob;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCjob() {
		return cjob;
	}

	public void setCjob(String cjob) {
		this.cjob = cjob;
	}
	
	
	 
}
