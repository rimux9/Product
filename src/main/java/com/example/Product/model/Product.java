package com.example.Product.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Product {
    @Id
    private  Integer id;
    private String name;
    private String category;
    private String description;

    public Product(Integer id, String name, String category, String description) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
    }


    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
