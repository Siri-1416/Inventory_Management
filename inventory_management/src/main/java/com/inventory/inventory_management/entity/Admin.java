package com.inventory.inventory_management.entity;

import java.sql.Date;
import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Admin {
	
	@Id
	private String admin_Email;
	private String password;
	private String first_Name,last_Name;
	
	@JsonFormat(pattern="DD-MM-yyyy")
	private Date dateOfBirth;
	private int age;
	private int mobile_no;
	private String address;
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int referral_Code;
	private byte[] image;
	public String getAdmin_Email() {
		return admin_Email;
	}
	public void setAdmin_Email(String admin_Email) {
		this.admin_Email = admin_Email;
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
	public int getReferral_Code() {
		return referral_Code;
	}
	public void setReferral_Code(int referral_Code) {
		this.referral_Code = referral_Code;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Admin(String admin_Email, String password, String first_Name, String last_Name, Date dateOfBirth, int age,
			int mobile_no, String address, int referral_Code, byte[] image) {
		super();
		this.admin_Email = admin_Email;
		this.password = password;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.dateOfBirth = dateOfBirth;
		this.age = age;
		this.mobile_no = mobile_no;
		this.address = address;
		this.referral_Code = referral_Code;
		this.image = image;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [admin_Email=" + admin_Email + ", password=" + password + ", first_Name=" + first_Name
				+ ", last_Name=" + last_Name + ", dateOfBirth=" + dateOfBirth + ", age=" + age + ", mobile_no="
				+ mobile_no + ", address=" + address + ", referral_Code=" + referral_Code + ", image="
				+ Arrays.toString(image) + "]";
	}
}
