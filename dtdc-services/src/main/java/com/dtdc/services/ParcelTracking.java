package com.dtdc.services;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "ParcelTracking", targetNamespace = "http://www.dtdc.com/tracking/services")
public interface ParcelTracking {

	@WebResult(name = "parcel-status", targetNamespace = "http://www.dtdc.com/tracking/types")
	@WebMethod()
	String track(@WebParam(name = "arw-no", targetNamespace = "http://www.dtdc.com/tracking/types") int arwNo,
			@WebParam(name = "mobile-no", targetNamespace = "http://www.dtdc.com/tracking/types") int mobileNo);
}
