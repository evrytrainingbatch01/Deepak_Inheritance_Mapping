package com.evry.tableperconcreate.hospital;



import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="inpatient02")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class InPatient extends Patient {

	@Column(name="city")
	private String city;
	
	@Column(name="wardno")
	private int wardno;
	
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

	public int getWardno() {
		return wardno;
	}

	public void setWardno(int wardno) {
		this.wardno = wardno;
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
