package com.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.entities.Product;
import com.events.ProductCreatedEvent;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	private final KafkaTemplate<String, ProductCreatedEvent> kafkaTemplate;

	public String createProduct() {
		// ... Save the product in the database
		// Publish ProductCreatedEvent
		ProductCreatedEvent event = new ProductCreatedEvent();
		event.setProductId(1L);
		event.setProductName("Computer");
		kafkaTemplate.sendDefault(event);
		return "created event successfully";
	}

}
