package com.deliveryboy.config;

public class DeliveryHelper {

	public static final String LOCATION_tOPIC_NAME = "delivery-location-topic";
	
	public static String getLocation() {
		
		return "("+Math.round(Math.random()*100)+", "+Math.round(Math.random()*100)+")";
	}
}
