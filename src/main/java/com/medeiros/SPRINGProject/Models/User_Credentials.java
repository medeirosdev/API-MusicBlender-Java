package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.*;

@Entity
@Table(name="User_Credentials")
public class User_Credentials {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String email;
    private String password;

    private String username;

    public User_Credentials( String email, String password, String username){

        this.email = email;
        this.password = password;
        this.username = username;

    }

    public User_Credentials(){

    }
}
