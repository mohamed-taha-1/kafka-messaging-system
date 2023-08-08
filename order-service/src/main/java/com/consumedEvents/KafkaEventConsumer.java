package com.consumedEvents;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class KafkaEventConsumer {

	@Value("${spring.kafka.topics.my-topic.name}")
	private String topicName;
	
	
	

	@KafkaListener(topics = "${spring.kafka.topics.my-topic.name}", groupId = "${spring.kafka.consumer.group-id}")
	public void listen(String message) {
		// Handle the received message
		System.out.println("Received message: "+topicName +"\t"+ message);
	}
	
	

}
