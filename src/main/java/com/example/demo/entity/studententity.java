package com.example.demo.entity

@Entity
public class studententity{
    private integer id;
    private String name;
    private String email;
    private String password;
    private Date createAt;

    
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