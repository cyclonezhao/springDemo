package org.example.entity;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private int id;
    private String number;
    private User user;
    private List<Product> products;
}
