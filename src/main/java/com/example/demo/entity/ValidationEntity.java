package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotNull;
@Entity
public class ValidationEntity{
    private Long id;
    @Not
    private String username;
    private String email;
    private String password;
    private int age;

}