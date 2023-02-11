package com.example.demo.products;

public class Produkt {
    private int id_p;
    private String name;
    private int price;

    public int getId_p() {
        return id_p;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setId_p(int id_p) {
        this.id_p = id_p;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Produkt() {
    }
}
