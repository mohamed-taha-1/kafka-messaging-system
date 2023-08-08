package com.events;

import lombok.Data;

@Data
public class ProductCreatedEvent {

	private int productId;
	private String productName;
}
