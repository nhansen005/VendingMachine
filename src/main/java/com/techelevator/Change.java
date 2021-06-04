package com.techelevator;



public class Change {
    private static int numberOfQuarters;
    private static int numberOfDimes;
    private static int numberOfNickels;
    private static double calculateChange;

    public static int getNumberOfQuarters() {
        return numberOfQuarters;
    }

    public static int getNumberOfDimes() {
        return numberOfDimes;
    }

    public static int getNumberOfNickels() {
        return numberOfNickels;
    }

    public static double getCalculateChange() {
        return calculateChange;
    }

    public static double getCalculateChange(double money){
        return calculateChange;
    }
    public void giveChange(double calculateChange1) {
        calculateChange = (calculateChange * 100);
        numberOfQuarters = (int) (calculateChange / 25);
        calculateChange = calculateChange - (numberOfQuarters * 25);
        numberOfDimes = (int) (calculateChange /10);
        calculateChange = calculateChange - (numberOfDimes * 10);
        numberOfNickels = (int) (calculateChange / 5);
        calculateChange = calculateChange - (numberOfNickels * 5);

        calculateChange = 0;
        System.out.println("Your change is " + numberOfQuarters + " Quarters " + numberOfDimes + " Dimes " + numberOfNickels + " Nickels ");

    }



   /* int quarters = 0;
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









*/
}
