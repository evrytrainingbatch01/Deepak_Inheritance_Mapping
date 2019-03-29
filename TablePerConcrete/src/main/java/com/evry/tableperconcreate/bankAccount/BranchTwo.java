package com.evry.tableperconcreate.bankAccount;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="branch02")
@AttributeOverrides({
	@AttributeOverride(name="id", column=@Column(name="id")),
	@AttributeOverride(name="name", column=@Column(name="name"))
})
public class BranchTwo extends Bank {

	
	@Column(name="city")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
