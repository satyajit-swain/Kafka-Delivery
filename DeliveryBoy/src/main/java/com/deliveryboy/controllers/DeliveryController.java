package com.deliveryboy.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deliveryboy.config.DeliveryHelper;
import com.deliveryboy.services.DeliveryBoyService;

@RestController
@RequestMapping("/delivery_app")
public class DeliveryController {

	@Autowired
	private DeliveryBoyService deliveryService;
	
	@PostMapping("/location")
	public ResponseEntity<?>updateLocation(){
		deliveryService.updateDeliveryLocation(DeliveryHelper.getLocation());
		return new ResponseEntity<>(Map.of("message","location updated"),HttpStatus.OK);
	}
}
