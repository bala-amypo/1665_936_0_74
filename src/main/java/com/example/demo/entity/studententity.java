package com.example.demo.entity
import jakarta.persistence.Entity;
import jakarta.persistence.id;
impo
@Entity
public class studententity{
    @id
    @GeneratedValue
    private integer id;
    private String name;
    private String email;
    private String password;
    private Date created;

    
}

public Integer getid(){
    return id;
}
public void setid(Integer id){
    this.id=id;
}

public String getname{
    return name;
}
public void setname(String name){
    this.name=name;
}
public String getemail{
    return email;
}
public void setemail(String email){
    this.email=email;
}
public String getpassword(){
    return password;
}
public void setpassword(String password){
    this.password=password;
}
public Date getcreated(){
    return created;
}
public void setcreated(Date created){
    this.created=created;
}

public studententity(Integer id,String name,String email,String password,Date created){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password=password;
    this.created=created;
}
public SampleEntity(){
    
}