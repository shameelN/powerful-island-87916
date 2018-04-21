package com.shameel.locationsvr.service;

import org.springframework.stereotype.Service;

@Service
public interface LocServices {
	
    public String getLocationById(String id);
	
	public void updateLocById(String id);

}
