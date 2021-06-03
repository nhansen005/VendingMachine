package com.techelevator;

public interface Inventory {

    public String getMessage();

    public String getSlot();

    public String getName();

    public double getPrice();

    public int getQuantity();

    public int decrement();
}
