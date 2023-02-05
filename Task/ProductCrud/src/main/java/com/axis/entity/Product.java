package com.axis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product123")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Pname;
	private int pCost;
	private String pDetails;
	
	
	public Product() {
		super();
	}


	public Product(int id, String pname, int pCost, String pDetails) {
		super();
		this.id = id;
		Pname = pname;
		this.pCost = pCost;
		this.pDetails = pDetails;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPname() {
		return Pname;
	}


	public void setPname(String pname) {
		Pname = pname;
	}


	public int getpCost() {
		return pCost;
	}


	public void setpCost(int pCost) {
		this.pCost = pCost;
	}


	public String getpDetails() {
		return pDetails;
	}


	public void setpDetails(String pDetails) {
		this.pDetails = pDetails;
	}
	
	
	
}

