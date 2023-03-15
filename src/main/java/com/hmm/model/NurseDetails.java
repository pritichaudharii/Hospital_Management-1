package com.hmm.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NurseDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int nurse_id;
	private String nurse_firstName;
	private String nurse_lastName;
	private Date date;
	public int getNurse_id() {
		return nurse_id;
	}
	public void setNurse_id(int nurse_id) {
		this.nurse_id = nurse_id;
	}
	public String getNurse_firstName() {
		return nurse_firstName;
	}
	public void setNurse_firstName(String nurse_firstName) {
		this.nurse_firstName = nurse_firstName;
	}
	public String getNurse_lastName() {
		return nurse_lastName;
	}
	public void setNurse_lastName(String nurse_lastName) {
		this.nurse_lastName = nurse_lastName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "NurseDetails [nurse_id=" + nurse_id + ", nurse_firstName=" + nurse_firstName + ", nurse_lastName="
				+ nurse_lastName + ", date=" + date + "]";
	}
}
