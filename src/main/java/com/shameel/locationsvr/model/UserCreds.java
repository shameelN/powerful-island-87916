package com.shameel.locationsvr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="usercreds")
public class UserCreds {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private int uid;
	private String name;
	private String device;
	private String email;
	
	
	public UserCreds() {
	
	}

	public UserCreds(String name, String device) {
		this.name = name;
		this.device = device;
	}
	
	public int getId() {
		return uid;
	}
	public void setId(int uid) {
		this.uid = uid;
	}
	
	
	public String getName() {
		return name;
	}
	
	@Column(name="name")
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name="device")
	public String getDevice() {
		return device;
	}
	
	@Column(name="device")
	public void setDevice(String device) {
		this.device = device;
	}
	@Override
	public String toString() {
		return "UserCreds [uid=" + uid + ", name=" + name + ", device=" + device + "]";
	}

	public String getEmail() {
		return email;
	}
    
	@Column(name="email")
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
