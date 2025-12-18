package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Email;

@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2,max = 0,message = "must be 2 to 10 characters" )

    private String username;
    @Email(message = "Email is not Valid")
    private String email;
    @Max(6)
    @NotNull(message = "Password is mandatory")
    @Size(min = 2,max)
    private String password;
    @Positive(message = "Age mus be a Positive Number")
    private int age;

}