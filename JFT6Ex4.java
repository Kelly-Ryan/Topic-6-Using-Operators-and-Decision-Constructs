/*
3 December 2018
Kelly Ryan

Exercise 4
Create a Java program to model the basic workings of an ATM machine.
Use an if-else statement to determine if a cash withdrawal can be made.
Assume the amount to withdraw is 20.
Assume the existing balance is 180.
Determine if the withdrawal request can be made.
If the request is processed, calculate and display the new balance.
Save the program as JFT6Ex4.java
 */

public class JFT6Ex4 {

    public static void main (String[] args) {

        double existingBalance = 180;
        double withdrawalAmount = 20;

        if (existingBalance > withdrawalAmount) {

            existingBalance -= withdrawalAmount;

            System.out.println("Withdrawal processed:"+withdrawalAmount);
            System.out.println("New Balance:" + existingBalance);
        } else {

            System.out.println("Insufficient funds.");
            System.out.println("Current Balance:"+existingBalance);
            System.out.println("Please select a different amount.");

        }
    }
}
