package com.dtdc.services;

import javax.jws.WebService;

@WebService(endpointInterface = "com.dtdc.services.ParcelTracking", serviceName = "ParcelTrackingService", portName = "ParcelTrackingPort")
public class ParcelTrackingImpl{

	public String track(int arwNo, int mobileNo) {
		return "in-transit";
	}
	
}
