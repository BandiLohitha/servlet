package com.org.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {

	@Id
	private int bid;
	private String bname;
	private double price;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
