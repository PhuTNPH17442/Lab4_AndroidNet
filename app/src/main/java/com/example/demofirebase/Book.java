package com.example.demofirebase;

import java.io.Serializable;

public class Book implements Serializable {
    public String name;
    public int price;
    public String author;
    public String images;

    public Book() {
    }

    public Book(String name, int price, String author, String images) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.images = images;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
