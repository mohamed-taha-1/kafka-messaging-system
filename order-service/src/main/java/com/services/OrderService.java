package com.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.consumedEvents.ProductCreatedEvent;

@Service
public class OrderService {

	 @KafkaListener(topics = "product-events", groupId = "order-service")
	    public String handleProductCreatedEvent(ProductCreatedEvent event) {
	        // Process the event, e.g., update order service's state
	        System.out.println("Received ProductCreatedEvent: " + event.getProductName());
	        
	        return  event.getProductName();
	    }
}
