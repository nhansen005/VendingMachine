package com.techelevator;

import java.math.BigDecimal;

public class Gum implements Inventory {

    private String name;
    private BigDecimal price;
    private int quantity;
    private String slot;
    private String type;

    public Gum(String name, BigDecimal price, int quantity, String slot, String type ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.slot = slot;
        this.type = type;
    }

    @Override
    public String getMessage() {
        return "Chew Chew, Yum!";
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getType() {
        return type;
    }

    public String getSlot() {
        return slot;
    }
    public int decrement() {
        quantity = quantity - 1;
        return quantity;
    }
}
