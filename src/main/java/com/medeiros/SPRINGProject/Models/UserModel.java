package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.*;
import org.apache.catalina.User;

@Entity
@Table(name="User")
public class UserModel {


    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String CPF;
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
    public UserModel(){

    }
    public UserModel(int id, String name, int age, String CPF ){
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.CPF = CPF;
    }
}
