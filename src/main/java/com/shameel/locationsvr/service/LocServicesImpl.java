package com.shameel.locationsvr.service;



import java.util.List;

import javax.json.Json;
import javax.json.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shameel.locationsvr.dao.LocationDao;
import com.shameel.locationsvr.model.DeviceInfoPacket;
import com.shameel.locationsvr.model.DeviceLoc;
import com.shameel.locationsvr.model.UserCreds;

@Service
public class LocServicesImpl implements LocationServices {
	
	@Autowired
	private LocationDao locationDao;

	@Override
	public DeviceLoc getLocationById(String id) {
		//JsonObject result = Json.createObjectBuilder()
       // 		.add("Id", "Apple123")
        //		.add("lat",23)
        	//	.add("lng", 50)
        		//.build();
        
    // return result.toString();
        			
        		
     return locationDao.getLocationByCredsId(id);	

	}

	@Override
	public String updateLocById(DeviceLoc deviceLoc) {
		return locationDao.saveDeviceLoc(deviceLoc);
		
	}

	@Override
	public int updateLocation(DeviceInfoPacket packet) {
		
		return locationDao.DeviceLocation(packet);
	}

	@Override
	public void saveUserCred(String name) {
		UserCreds newUserCreds = new UserCreds(name, "Albert");
		
		locationDao.saveMyCreds(newUserCreds);
		//locationDao.save(newUserCreds);
		
	}

	@Override
	public List<UserCreds> getAllLocationId() {
		return locationDao.getAllCredsId();
		
	}

	

	}


