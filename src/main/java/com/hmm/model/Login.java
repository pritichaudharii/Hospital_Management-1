package com.hmm.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int login_id;
	private String userName;
	private String password;
	private int master_type_id;
	public int getLogin_id() {
		return login_id;
	}
	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMaster_type_id() {
		return master_type_id;
	}
	public void setMaster_type_id(int master_type_id) {
		this.master_type_id = master_type_id;
	}
	@Override
	public String toString() {
		return "Login [login_id=" + login_id + ", userName=" + userName + ", password=" + password + ", master_type_id="
				+ master_type_id + "]";
	}
}
