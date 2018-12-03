/*
3 December 2018
Kelly Ryan

Exercise 5
This is similar to the previous exercise.
Assume the amount to withdraw is 20.
Assume the existing balance is 180.
Determine if the withdrawal request can be made.

Display one of two messages.
▪ Insufficient funds
▪ Withdrawal processed

Use the conditional ternary operator (?:) to solve the problem.
The value returned by the conditional ternary operator should be stored in a variable of type String.
Output the value of the String to the console.
Save the program as JFT6Ex5.java
 */

public class JFT6Ex5 {

    public static void main (String[] args) {

        double existingBalance = 180;
        double withdrawalAmount = 20;

        String str = (existingBalance > withdrawalAmount) ? ("Withdrawal processed.") : ("Insufficient funds.");

                System.out.println(str);

    }
}
