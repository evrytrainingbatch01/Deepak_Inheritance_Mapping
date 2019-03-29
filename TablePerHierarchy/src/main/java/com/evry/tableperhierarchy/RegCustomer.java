package com.evry.tableperhierarchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regcustomer")
public class RegCustomer extends Customer {

	
	@Column(name="price")
	private double price;
	
	@Column(name="amount")
	private int amount;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	
}
