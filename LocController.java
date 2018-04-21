package com.shameel.locationsvr.controller;

import java.util.ArrayList;
import java.util.List;

import javax.json.JsonObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shameel.locationsvr.model.DeviceLoc;
import com.shameel.locationsvr.model.UserCreds;
import com.shameel.locationsvr.service.LocServicesImpl;
//import com.shameel.locationsvr.service.LocServices;
import com.shameel.locationsvr.service.LocationServices;



@RestController
public class LocController {
	
	@Autowired
	LocationServices locationServices;
	UserCreds userCred;
	
	@RequestMapping(value="/register/{id}", method=RequestMethod.POST)
	public ResponseEntity<UserCreds>  RegisterId(@PathVariable final DeviceLoc deviceLoc){
		
		
		locationServices.updateLocById(deviceLoc);
		
		return new ResponseEntity<UserCreds>(userCred, HttpStatus.OK);
		
	}
	
	@RequestMapping(value="/location/{id}", method=RequestMethod.GET, produces="application/json")
	public DeviceLoc  locationPt(@PathVariable final String id){
		
		//List<UserCreds> usercreds = new ArrayList<>();
		
		//usercreds.add(new UserCreds("albert1","shameel1"));
		//usercreds.add(new UserCreds("albert2","shameel2"));
		//usercreds.add(new UserCreds("albert3","shameel3"));
		
		return (DeviceLoc) locationServices.getLocationById(id);
		//return usercreds;
		
	}
	
	
	@RequestMapping(value="/location", method=RequestMethod.GET, produces="application/json")
	public List<UserCreds> getAllLocationsId(){
		
		//List<UserCreds> usercreds = new ArrayList<>();
		
		//usercreds.add(new UserCreds("albert1","shameel1"));
		//usercreds.add(new UserCreds("albert2","shameel2"));
		//usercreds.add(new UserCreds("albert3","shameel3"));
		
		return  locationServices.getAllLocationId();
		//return usercreds;
		
	}
	
	@RequestMapping(value="/saveUserCreds", method=RequestMethod.POST,produces="application/json")
	public ResponseEntity<String> SaveMyCreds(@RequestBody String name){
		
		
		locationServices.saveUserCred(name);
		
		return new ResponseEntity<String>("Creds saved " + name, HttpStatus.OK);
		
	}
	
	//@RequestMapping(value="/saveLocUpdate", method=RequestMethod.POST,produces="application/json")
	@RequestMapping(value="/saveLocUpdate", method=RequestMethod.POST,produces="application/text")
	//public ResponseEntity<String> SaveLocUpdate(@RequestBody DeviceLoc deviceLoc){
    public String SaveLocUpdate(@RequestBody DeviceLoc deviceLoc){	
		
		String deviceKey = (String)locationServices.updateLocById(deviceLoc);
		
		//return new ResponseEntity<String>("Creds updated " + deviceKey, HttpStatus.OK);
		return deviceKey;
		
	}
	

}
