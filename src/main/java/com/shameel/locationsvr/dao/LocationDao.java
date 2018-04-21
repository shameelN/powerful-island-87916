package com.shameel.locationsvr.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.shameel.locationsvr.model.DeviceInfoPacket;
import com.shameel.locationsvr.model.DeviceLoc;
import com.shameel.locationsvr.model.UserCreds;


//@Transactional
@Repository
public interface LocationDao{
	
	public void  createLocation();
	
	public DeviceLoc getLocationByCredsId(String id);  
	
	public void saveMyCreds(UserCreds userCreds);
	
	public String saveDeviceLoc(DeviceLoc deviceLoc);
	
	public List<UserCreds> getAllCredsId();
	
	public int DeviceLocation(DeviceInfoPacket packet);

}
