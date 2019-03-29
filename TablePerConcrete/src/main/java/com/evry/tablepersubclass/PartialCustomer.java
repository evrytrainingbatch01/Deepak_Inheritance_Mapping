package com.evry.tablepersubclass;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="partialcustomer100")
@PrimaryKeyJoinColumn(name="ID")
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
