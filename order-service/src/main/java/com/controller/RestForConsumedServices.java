package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumedEvents.ProductCreatedEvent;
import com.services.OrderService;

@RestController
@RequestMapping("/orders")
public class RestForConsumedServices {
	
	 private final OrderService orderService;
	 private final ProductCreatedEvent event;

	    @Autowired
	    public RestForConsumedServices(OrderService orderService, ProductCreatedEvent event) {
	        this.orderService = orderService;
	        this.event=event;
	    }
	    
	    
	    
	    @GetMapping("/handle-event")
	    public String handleEvents() {
	    	
	    return	orderService.handleProductCreatedEvent(event);
	    }
	 
	 

}
