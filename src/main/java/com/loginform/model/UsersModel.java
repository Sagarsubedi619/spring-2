package com.loginform.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author Sagar Subedi
 *
 */

@Entity
@Table(name = "users_table")
public class UsersModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	private String logString;
	private String passwordString;
	private String emailString;

	public UsersModel(Integer id, String logString, String passwordString, String emailString) {
		super();
		this.id = id;
		this.logString = logString;
		this.passwordString = passwordString;
		this.emailString = emailString;
	}

	public UsersModel() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogString() {
		return logString;
	}

	public void setLogString(String logString) {
		this.logString = logString;
	}

	public String getPasswordString() {
		return passwordString;
	}

	public void setPasswordString(String passwordString) {
		this.passwordString = passwordString;
	}

	public String getEmailString() {
		return emailString;
	}

	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}

	@Override
	public String toString() {
		return "UsersModel [id=" + id + ", logString=" + logString + ", emailString=" + emailString + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(emailString, id, logString, passwordString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsersModel other = (UsersModel) obj;
		return Objects.equals(emailString, other.emailString) && Objects.equals(id, other.id)
				&& Objects.equals(logString, other.logString) && Objects.equals(passwordString, other.passwordString);
	}
}
