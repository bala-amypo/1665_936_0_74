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


     //Name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //Id -primary key
    public Integer getID(){
        return id;
    }
    public void setID(Integer id){
        this.id=id;
    }

    //Email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    // Password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }

    // Age
    public int age(){
        return age;
    }
    public void age(int age){
        this.age=age;
    }
    //Parameter constructor
    public ValidationEntity(Long id,
    @NotNull
    @Size(min = 2,max = 0,message = "must be 2 to 10 characters" )

    String username,
    @Email(message = "Email is not Valid")
    String email,
    @Max(6)
    @NotNull(message = "Password is mandatory")
    @Size(min = 2,max)
    String password,
    @Positive(message = "Age mus be a Positive Number")
    int age)
    {

        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.age=age;
    
    }

     // Default constructor
    public ValidationEntity(){

    }
}

