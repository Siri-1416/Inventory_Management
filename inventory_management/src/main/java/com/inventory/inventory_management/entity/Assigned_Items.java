package com.inventory.inventory_management.entity;


import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


public class Assigned_Items {

	@OneToOne
	private Employee employee_Email;
	
	@ManyToOne
	private Items item_Id;

	public Employee getEmployee_Email() {
		return employee_Email;
	}

	public void setEmployee_Email(Employee employee_Email) {
		this.employee_Email = employee_Email;
	}

	public Items getItem_Id() {
		return item_Id;
	}

	public void setItem_Id(Items item_Id) {
		this.item_Id = item_Id;
	}

	public Assigned_Items(Employee employee_Email, Items item_Id) {
		super();
		this.employee_Email = employee_Email;
		this.item_Id = item_Id;
	}

	public Assigned_Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Assigned_Items [employee_Email=" + employee_Email + ", item_Id=" + item_Id + "]";
	}
	
	
}
