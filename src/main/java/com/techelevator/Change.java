package com.techelevator;

import java.math.BigDecimal;

public class Change {

    int quarters = 0;
    int dimes = 0;
    int nickels = 0;

    public int getQuarters() {
        return quarters;
    }

    public int getDimes() {
        return dimes;
    }

    public int getNickels() {
        return nickels;
    }

    public String change(BigDecimal input) {
        BigDecimal hundred = new BigDecimal("100.00");
        BigDecimal holder = (input.multiply(hundred));
        int x = holder.intValue();

        while (x >= 25) {

            quarters ++;

            x -= 25;
        }

        while (x >= 10) {
            dimes ++;
            x -= 10;
        }

        while (x >= 5) {
            nickels ++;
            x -= 5;
        }

        String endTotal = "Dispensing change is" + quarters + dimes + nickels;

        return endTotal;
    }










}
