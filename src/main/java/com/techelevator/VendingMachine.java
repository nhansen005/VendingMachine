package com.techelevator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class VendingMachine {
    private double balance = 0;


    public File getInputFile() {
        String path = "//Users/srandhawa/development/IntelliJ_Projects/Capstone1-VendingMachine/TechElevatorCapstone1/vendingmachine.csv";
        File inputFile = new File(path);

        if (!inputFile.exists()) { // checks for the existence of a file
            System.out.println(path + " does not exist");
            System.exit(1); // Ends the program

        } else if (!inputFile.isFile()) {
            System.out.println(path + " is not a file");
            System.exit(1); // Ends the program if no File detected
        }
        return inputFile;
    }

    public double getBalance() {
        return balance;
    }

    public void feedMoney(double addMoney) {
        Set<Double> values = new HashSet<Double>(Arrays.asList(
                new Double[]{1.00, 2.00, 5.00, 10.00}));
        if (values.contains(addMoney)) {
            balance += addMoney;
        } else {
            System.out.println("Invalid Currency Amount, Only $1s, $2s, $5s, and $10");
        }
    }
}