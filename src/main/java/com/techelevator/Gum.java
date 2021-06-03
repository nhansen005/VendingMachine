package com.techelevator;

public class Gum implements Inventory {

    private String name;
    private double price;
    private int quantity;
    private String slot;

    public Gum(String name, double price, int quantity, String slot ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.slot = slot;
    }

    @Override
    public String getMessage() {
        return "Chew Chew, Yum!";
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getSlot() {
        return slot;
    }
    public int decrement() {
        quantity = quantity - 1;
        return quantity;
    }
}
