package com.example.mall.model;
import jakarta.persistence.*;
import lombok.Data;

import lombok.Data;
public class Customer {
	private Long id;
    private String name;
    private String email;
    private String password;
}
