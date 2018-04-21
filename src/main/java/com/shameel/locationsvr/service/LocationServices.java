package com.shameel.locationsvr.service;

import java.util.List;

import javax.json.JsonObject;

import org.springframework.stereotype.Service;

import com.shameel.locationsvr.model.DeviceInfoPacket;
import com.shameel.locationsvr.model.DeviceLoc;
import com.shameel.locationsvr.model.UserCreds;

@Service
public interface LocationServices {
   
   public DeviceLoc getLocationById(String id);
	
	public String updateLocById(DeviceLoc deviceLoc);
	
	public void saveUserCred(String name);
	
	public List<UserCreds> getAllLocationId();
	
	public int updateLocation(DeviceInfoPacket packet);
}
