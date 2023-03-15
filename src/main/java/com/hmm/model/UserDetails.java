package com.hmm.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String user_firstName;
	private String user_lastName;
	private String user_mailId;
	private String user_contact;
	private String user_address;
	@OneToOne(cascade=CascadeType.ALL)
	private Login login;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_firstName() {
		return user_firstName;
	}
	public void setUser_firstName(String user_firstName) {
		this.user_firstName = user_firstName;
	}
	public String getUser_lastName() {
		return user_lastName;
	}
	public void setUser_lastName(String user_lastName) {
		this.user_lastName = user_lastName;
	}
	public String getUser_mailId() {
		return user_mailId;
	}
	public void setUser_mailId(String user_mailId) {
		this.user_mailId = user_mailId;
	}
	public String getUser_contact() {
		return user_contact;
	}
	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}
	@Override
	public String toString() {
		return "UserDetails [user_id=" + user_id + ", user_firstName=" + user_firstName + ", user_lastName="
				+ user_lastName + ", user_mailId=" + user_mailId + ", user_contact=" + user_contact + ", user_address="
				+ user_address + ", login=" + login + "]";
	}
}
