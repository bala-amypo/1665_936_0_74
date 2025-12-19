package com.example.demo.entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


import jakarta.validation.constraints.*;
import jakata.persistence.*;
import lombok.*;
import java.util.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistance.PrePersist;
import jakarta.persistance.updateAt


@Entity
@Data
@Getter
@Setter
@AllAgrsConstructor
@NoAgrsConstructor
@PrePersist
@PreUpdate
public class TimeStampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY);
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
