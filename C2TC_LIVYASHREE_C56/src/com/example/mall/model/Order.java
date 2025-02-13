package com.example.mall.model;
import java.util.Date;

import com.shoppingmalldemo.springboot_shoppingmall.Customer;
import com.shoppingmalldemo.springboot_shoppingmall.Product;

import jakarta.persistence.*;
import lombok.Data;
public class Order {
	private Long id;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    
    private int quantity;
    private Date orderDate;
}
