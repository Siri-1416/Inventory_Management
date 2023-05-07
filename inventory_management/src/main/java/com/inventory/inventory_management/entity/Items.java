package com.inventory.inventory_management.entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Items {

	@Id
	private int item_Id;
	private String item_Name;
	private String category;
	private int bill_No;
	
	@JsonFormat(pattern="DD-MM-yyyy")
	private Date dateOfPurchase;
	private int warranty ;
	private String expiryDate;
	public int getItem_Id() {
		return item_Id;
	}
	public void setItem_Id(int item_Id) {
		this.item_Id = item_Id;
	}
	public String getItem_Name() {
		return item_Name;
	}
	public void setItem_Name(String item_Name) {
		this.item_Name = item_Name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBill_No() {
		return bill_No;
	}
	public void setBill_No(int bill_No) {
		this.bill_No = bill_No;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public Items(int item_Id, String item_Name, String category, int bill_No, Date dateOfPurchase, int warranty,
			String expiryDate) {
		super();
		this.item_Id = item_Id;
		this.item_Name = item_Name;
		this.category = category;
		this.bill_No = bill_No;
		this.dateOfPurchase = dateOfPurchase;
		this.warranty = warranty;
		this.expiryDate = expiryDate;
	}
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Items [item_Id=" + item_Id + ", item_Name=" + item_Name + ", category=" + category + ", bill_No="
				+ bill_No + ", dateOfPurchase=" + dateOfPurchase + ", warranty=" + warranty + ", expiryDate="
				+ expiryDate + "]";
	}
}
 
	
	

