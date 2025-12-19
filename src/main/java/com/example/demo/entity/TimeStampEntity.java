package com.example.demo.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


import jakarta.validation.constraints.*;
import jakata.persistence.*;
import lombok.*;
import java.util.*;
@Entity
@Data
@Getter
@Setter
@AllAgrsConstructor
@NoAgrsConstructor
public class TimeSampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY);
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}