/*
3 December 2018
Kelly Ryan

Exercise 6
The bouncer at the local pub will only allow a patron to enter, if both of the following conditions are met:
- The patron must be 18 years of age or older.
- The patron must be sober.
Create a Java program, making use of an if-else statement to determine if a patron can enter the pub.
Make use of variables as part of your solution and store sample values. Test your solution.
Save the program as JFT6Ex6.java
 */

public class JFT6Ex6 {

    public static void main (String[] args) {

        int patronAge = 21;
        boolean patronSober = false;

        if(patronAge >= 18 && patronSober) {

            System.out.println("Welcome, have a good night.");
        } else {

            System.out.println("Not tonight, sorry.");
        }
    }

}
