package com.shameel.locationsvr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="deviceinfopacket")
public class DeviceInfoPacket {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotNull
	private int uid;
	private String devicekey;
	private Double lat;
	private Double lng;
	private String devicestate;
	private String stamp;
	private String battery;
	private String info1;
	private String info2;
	private String info3;
	
	
	
	public DeviceInfoPacket() {

	}

	public DeviceInfoPacket(String devicekey, Double lat, Double lng, String devicestate, String stamp, String battey,
			String info1, String info2, String info3) {
	
		this.devicekey = devicekey;
		this.lat = lat;
		this.lng = lng;
		this.devicestate = devicestate;
		this.stamp = stamp;
		this.battery = battery;
		this.info1 = info1;
		this.info2 = info2;
		this.info3 = info3;
	}

	
	
	public int getuid() {
		return uid;
	}



	public void setKeyid(int uid) {
		this.uid = uid;
	}



	public String getDevicekey() {
		return devicekey;
	}


	@Column(name="devicekey")
	public void setDevicekey(String devicekey) {
		this.devicekey = devicekey;
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



	public String getDevicestate() {
		return devicestate;
	}


	@Column(name="devicestate")
	public void setDevicestate(String devicestate) {
		this.devicestate = devicestate;
	}



	public String getStamp() {
		return stamp;
	}


	@Column(name="stamp")
	public void setStamp(String stamp) {
		this.stamp = stamp;
	}



	public String getBattery() {
		return battery;
	}


	@Column(name="battery")
	public void setBattery(String batterty) {
		this.battery = batterty;
	}



	public String getInfo1() {
		return info1;
	}


	@Column(name="info1")
	public void setInfo1(String info1) {
		this.info1 = info1;
	}


	
	public String getInfo2() {
		return info2;
	}


	@Column(name="info2")
	public void setInfo2(String info2) {
		this.info2 = info2;
	}



	public String getInfo3() {
		return info3;
	}


	@Column(name="info3")
	public void setInfo3(String info3) {
		this.info3 = info3;
	}



	@Override
	public String toString() {
		return "DeviceInfoPacket [devicekey=" + devicekey + ", lat=" + lat + ", lng=" + lng + ", devicestate="
				+ devicestate + ", stamp=" + stamp + ", batterty=" + battery + ", info1=" + info1 + ", info2=" + info2
				+ ", info3=" + info3 + "]";
	}
	
	
	
	
	

}
