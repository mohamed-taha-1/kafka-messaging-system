package com.events;

import lombok.Data;

@Data
public class ProductCreatedEvent {

	private Long productId;
	private String productName;
}
