package com.evry.tablepersubclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="regcustomer100")
@PrimaryKeyJoinColumn(name="ID")
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
