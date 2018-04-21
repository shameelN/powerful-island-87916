package com.shameel.locationsvr.dao;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.shameel.locationsvr.model.DeviceInfoPacket;
import com.shameel.locationsvr.model.DeviceLoc;
import com.shameel.locationsvr.model.UserCreds;
@Transactional
@Repository
public class LocationDaoImplMysql implements LocationDao {
	
	//Configuration cfg = new Configuration().addResource("Student.hbm.xml").addResource("University.hbm.xml");
	
	
	//Configuration cfg = new Configuration()
//			.addClass(com.shameel.locationsvr.model.UserCreds.class);
//	SessionFactory sessionFactory = cfg.buildSessionFactory();
//	Session session = sessionFactory.openSession();
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	private Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public LocationDaoImplMysql() {
		
		//Configuration cfg = new Configuration()
				
		//		.addClass(com.shameel.locationsvr.model.UserCreds.class);
		//SessionFactory sessionFactory = cfg.buildSessionFactory();
	
		//this.session = sessionFactory.openSession();
	
	}
	
	
	@Override
	public void createLocation() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public DeviceLoc getLocationByCredsId(String id) {
		return (DeviceLoc) getSession().get(DeviceLoc.class,id);
		
		
	}
	@Override
	public void saveMyCreds(UserCreds newUserCreds) {
		//session.getCurrentSession().save(newUserCreds);
		//session.persist(newUserCreds);
		getSession().save(newUserCreds);
		
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<UserCreds> getAllCredsId() {
		
		//List<UserCreds> userCreds = new ArrayList<>();
		//userCreds = getSession().createCriteria("from usercreds").list();
		//return userCreds;
		return getSession().createQuery("from UserCreds").list();
	}

	@Override
	public String saveDeviceLoc(DeviceLoc deviceLoc) {
		return (String) getSession().save(deviceLoc);
		
	}

	@Override
	public int DeviceLocation(DeviceInfoPacket packet) {
		
		return (int) getSession().save(packet);
	}
	
	

	
}
