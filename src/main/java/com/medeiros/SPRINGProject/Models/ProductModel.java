package com.medeiros.SPRINGProject.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMusicId() {
        return MusicId;
    }

    public void setMusicId(int musicId) {
        MusicId = musicId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getListProduct() {
        return listProduct;
    }

    public void setListProduct(String listProduct) {
        this.listProduct = listProduct;
    }
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;

    private String description;

    private double price;

    private int MusicId;

    private int userId;

    public ProductModel( String description,
                        double price, int musicId, int userId,
                        String listProduct) {

        this.description = description;
        this.price = price;
        this.MusicId = musicId;
        this.userId = userId;
        this.listProduct = listProduct;
    }

    public ProductModel(){

    }

    private String listProduct;

}
