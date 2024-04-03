package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class EndUserDeliveryConfig {
	
	@KafkaListener(topics = EndUserHelper.DELIVERY_TOPIC_NAME,groupId = EndUserHelper.GROUP_ID)
	public void updatedLocation(String location) {
		System.out.println(location);
	}
	
}
