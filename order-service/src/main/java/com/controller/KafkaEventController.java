package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumedEvents.KafkaEventConsumer;

@RestController
@RequestMapping("/consume")
public class KafkaEventController {

    private final KafkaEventConsumer kafkaEventConsumer;

    @Autowired
    public KafkaEventController(KafkaEventConsumer kafkaEventConsumer) {
        this.kafkaEventConsumer = kafkaEventConsumer;
    }

    @GetMapping
    public String consumeEvents() {
        // Manually trigger event consumption
        kafkaEventConsumer.listen("Manual consumption triggered");
        return "Consumption triggered";
    }

}
