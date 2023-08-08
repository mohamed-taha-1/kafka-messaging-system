package com.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	 private final KafkaTemplate<String, String> kafkaTemplate;

	 public void produceEvent(String message) {
	       
	        kafkaTemplate.send("taha-topic", message);
	    }

}
