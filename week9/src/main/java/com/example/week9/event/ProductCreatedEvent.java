package com.example.week9.event;

import lombok.Data;

@Data
public class ProductCreatedEvent {
    private String productId;
    private String title;
    private String price;
    private String quantity;

}
