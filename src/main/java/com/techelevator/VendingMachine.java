package com.techelevator;

import org.w3c.dom.ls.LSOutput;

import java.io.File;


import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;



public class VendingMachine extends Change{
    private double balance = 0;


    List<Inventory> vendingArray = new ArrayList<>();


    public void loadInventory() {
        // read in the file
        File inputFile = new File("vendingmachine.csv");

        try (Scanner inputScanner = new Scanner(inputFile.getAbsoluteFile())) {
            while (inputScanner.hasNextLine()) {
                String lineInput = inputScanner.nextLine();
                String[] productInfo = lineInput.split("\\|");
                String slot = productInfo[0];
                String name = productInfo[1];
                double price = Double.parseDouble(productInfo[2]);
                String type = productInfo[3];
                if (type.equals("Chip")) {
                    vendingArray.add(new Chips(name, price, 5, slot, type));
                } else if (type.equals("Candy")) {
                    vendingArray.add(new Candy(name, price, 5, slot, type));
                } else if (type.equals("Gum")) {
                    vendingArray.add(new Candy(name, price, 5, slot, type));
                } else if (type.equals("Drink")) {
                    vendingArray.add(new Candy(name, price, 5, slot, type));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void displayInventory() {
        for (Inventory item : vendingArray) {
            System.out.println(item.getSlot() + " " + item.getName() + " $" + item.getPrice() + " Quantity: " + ""
                    + item.getQuantity());

            if (item.getQuantity() == 0) {
                System.out.println(item.getName() + " Out of stock");
            }
        }
    }

    public double getBalance() {
        return balance;
    }


    public double feedMoney(double addMoney) {
        if (addMoney == 1 || addMoney == 2 || addMoney == 5 || addMoney == 10) {
            balance += addMoney;
        } else {
            System.out.println("Not valid currency!");
        }
        return balance;
    }

    public double selectProduct(String userInput, double balance) {


        for (Inventory item : vendingArray) {
            if (userInput.equals(item.getSlot())) {
                if (item.getQuantity() <= 0) {
                    System.out.println("Out of Stock");
                }
                if (!userInput.equals(item.getSlot())) {
                    System.out.println("Please enter valid Slot");
                }
                if (userInput.equals(item.getSlot())) {
                    if (item.getQuantity() <= 5) {
                        item.decrement();

                        balance = balance - item.getPrice();
                        System.out.println("Remaining Balance: " + balance);

                        System.out.println(item.getName() + ": $" + item.getPrice());
                        System.out.println(item.getMessage());
                    } else{
                        System.out.println("Enter More Money");
                    }
                    return balance;
                }
            }

        }
        return balance;
    }
   
    public void finishTransaction(double calculateChange) {
        if(calculateChange  >= 0) {
             return getCalculateChange;

        }


    }


}