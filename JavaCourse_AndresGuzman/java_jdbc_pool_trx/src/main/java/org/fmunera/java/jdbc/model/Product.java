package org.fmunera.java.jdbc.model;

import java.util.Date;

public class Product {

    private Long id;
    private String name;
    private Integer price;
    private Date dateRegistered;
    private Category category;
    private String sku;

    public Product() {
    }

    public Product(Long id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(String name, Integer price, Date dateRegistered) {
        this.name = name;
        this.price = price;
        this.dateRegistered = dateRegistered;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + price + " | " + dateRegistered + " | " + category.getName() + " | " + sku + " | ";
    }
}
