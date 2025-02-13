package com.example.mall.model;
import lombok.Data;
import jakarta.persistence.*;

import jakarta.persistence.*;
import lombok.Data;
public class Product {
	private Long id;
    private String name;
    private double price;
    private int quantity;
    
    @ManyToOne
    @JoinColumn(name = "shop_owner_id")
    private ShopOwner shopOwner;
}
