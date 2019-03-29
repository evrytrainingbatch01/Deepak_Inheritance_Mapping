package com.evry.tableperhierarchy.hospital;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("outpatient")
public class OutPatient extends Patient {

	
	@Column(name="city")
	private String city;
	
	@Column(name="doctorname")
	private String doctorName;

	@Column(name="bill")
	private int billAmount;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
}
