package com.deliveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class DeliveryConfig {

    @Bean
    NewTopic topic() {
		
		return TopicBuilder.name(DeliveryHelper.LOCATION_tOPIC_NAME).build();
	}
	
}
