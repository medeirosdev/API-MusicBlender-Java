package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Info")
public class User_Info {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public User_Info(){}
    public User_Info(int id, String photoURL, String favoritesMusics, String gender, String phone, String instaURL, String twitterURL, String favoritesThings) {
        this.id = id;
        this.photoURL = photoURL;
        this.favoritesMusics = favoritesMusics;
        this.gender = gender;
        this.phone = phone;
        this.instaURL = instaURL;
        this.twitterURL = twitterURL;
        this.favoritesThings = favoritesThings;
    }

    private String photoURL;

    private String favoritesMusics;

    private String gender;

    private String phone;

    private String instaURL;

    private String twitterURL;

    private String favoritesThings;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

    public String getFavoritesMusics() {
        return favoritesMusics;
    }

    public void setFavoritesMusics(String favoritesMusics) {
        this.favoritesMusics = favoritesMusics;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInstaURL() {
        return instaURL;
    }

    public void setInstaURL(String instaURL) {
        this.instaURL = instaURL;
    }

    public String getTwitterURL() {
        return twitterURL;
    }

    public void setTwitterURL(String twitterURL) {
        this.twitterURL = twitterURL;
    }

    public String getFavoritesThings() {
        return favoritesThings;
    }

    public void setFavoritesThings(String favoritesThings) {
        this.favoritesThings = favoritesThings;
    }
}
