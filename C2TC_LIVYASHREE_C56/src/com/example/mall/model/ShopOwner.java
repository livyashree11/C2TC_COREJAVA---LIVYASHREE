package com.example.mall.model;
import jakarta.persistence.*;
import lombok.Data;
public class ShopOwner {
	private Long id;
    private String name;
    private String shopName;
    private String email;
    private String password;
}
