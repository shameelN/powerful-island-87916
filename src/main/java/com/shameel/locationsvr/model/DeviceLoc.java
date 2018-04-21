package com.shameel.locationsvr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="deviceloc")
public class DeviceLoc {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private String devicekey;
	private Double lat;
	private Double lng;
	
	
	public DeviceLoc() {
	
	}
	
	public DeviceLoc(String id, Double lat, Double lng) {
		this.devicekey = id;
		this.lat = lat;
		this.lng = lng;
	}
	
	public String getDevicekey() {
		return devicekey;
	}
	
	@Column(name="devicekey")
	public void setDevicekey(String id) {
		this.devicekey = id;
	}
	
	public Double getLat() {
		return lat;
	}
	
	@Column(name="lat")
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLng() {
		return lng;
	}
	
	@Column(name="lng")
	public void setLng(Double lng) {
		this.lng = lng;
	}
	@Override
	public String toString() {
		return "DeviceLoc [key=" + devicekey + ", lat=" + lat + ", lng=" + lng + "]";
	}
	
	

}
