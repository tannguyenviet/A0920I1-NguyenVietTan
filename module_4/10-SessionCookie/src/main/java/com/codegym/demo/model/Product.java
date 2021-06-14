package com.codegym.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
    private String name;
    @NotNull
    private int price;
    private String description;
    private String image;

    public Product() {
    }

    public Product(int id, @NotNull String name, @NotNull int price, String description, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }
    @Override
    public boolean equals(Object obj)
    {
        System.out.println("voo");
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        return (this.getId() == ((Product) obj).getId());
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}