package com.revature.revazon.models;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="products")
@Component
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private double price;
    private int rating;
    private String image;

    public Product(int productId, String title, double price, int rating, String image) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.image = image;
    }

    public Product(String title, double price, int rating, String image) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        this.image = image;
    }

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", image='" + image + '\'' +
                '}';
    }
}

