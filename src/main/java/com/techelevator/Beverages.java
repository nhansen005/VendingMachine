package com.techelevator;

import java.math.BigDecimal;

public class Beverages implements Inventory{

    private String name;
    private BigDecimal  price;
    private int quantity;
    private String slot;
    private String type;

    public Beverages(String name, BigDecimal  price, int quantity, String slot, String type ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.slot = slot;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return "Glug Glug, Yum!";
    }

    public String getName() {
        return name;
    }

    public  BigDecimal  getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSlot() {
        return slot;
    }

    public String getType() {
        return type;
    }

    public int decrement() {
        quantity = quantity - 1;
        return quantity;
    }

}


