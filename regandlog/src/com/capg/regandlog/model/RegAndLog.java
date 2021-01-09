package com.capg.regandlog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class RegAndLog {
	
	@Column(name = "name")
	private String name;
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	@Column(name = "mobile", length = 10)
	private long mobileNo;
	@Column(name = "email")
	private String email;
//	@Transient
	@Column(name = "password")
	private String password;
//	@Transient
	@Column(name = "confirmPassword")
	private String confirmPassword;
	
	public RegAndLog() {	
	}

	public RegAndLog(String name, int userId, long mobileNo, String email, String password, String confirmPassword) {
		super();
		this.name = name;
		this.userId = userId;
		this.mobileNo = mobileNo;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "RegAndLog [name=" + name + ", userId=" + userId + ", mobileNo=" + mobileNo + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}	
}
