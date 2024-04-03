package com.deliveryboy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.deliveryboy.config.DeliveryHelper;

@Service
public class DeliveryBoyService {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemp;
	
	public boolean updateDeliveryLocation(String location) {
		
		kafkaTemp.send(DeliveryHelper.LOCATION_tOPIC_NAME,location);
		return true;
	}
}
