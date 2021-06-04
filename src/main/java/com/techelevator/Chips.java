package com.techelevator;



public class Chips implements Inventory{

    private String name;
    private double  price;
    private int quantity;
    private String slot;
    private String type;

    public Chips(String name, double price, int quantity, String slot, String type ) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.slot = slot;
        this.type = type;
    }

    @Override
    public String getMessage() {

        return "Crunch Crunch, Yum!";
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
