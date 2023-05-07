package com.inventory.inventory_management.entity;

import java.sql.Date;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	private String employee_Email;
	private String password;
	private String first_Name,last_Name;
	
	@JsonFormat(pattern="DD-MM-yyyy")
	private Date dateOfBirth;
	private int age;
	private int mobile_no;
	private String address;
	private byte[] image;
	public String getEmployee_Email() {
		return employee_Email;
	}
	public void setEmployee_Email(String employee_Email) {
		this.employee_Email = employee_Email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Employee(String employee_Email, String password, String first_Name, String last_Name, Date dateOfBirth,
			int age, int mobile_no, String address, byte[] image) {
		super();
		this.employee_Email = employee_Email;
		this.password = password;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.mobile_no = mobile_no;
		this.address = address;
		this.image = image;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employee_Email=" + employee_Email + ", password=" + password + ", first_Name=" + first_Name
				+ ", last_Name=" + last_Name + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", mobile_no="
				+ mobile_no + ", address=" + address + ", image=" + Arrays.toString(image) + "]";
	}
}
