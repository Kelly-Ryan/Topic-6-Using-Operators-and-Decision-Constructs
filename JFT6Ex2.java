
/*
3 December 2018
Kelly Ryan

Exercise 2
A fishing trip will only go ahead if there are more than five registrations.
Assume that only two people want to go on the trip (store this information in a variable).
Create a Java program utilising an if-else statement to determine if the trip is to go ahead.
Display an appropriate message in the console.
Save the program as JFT6Ex2.java
*/


public class JFT6Ex2 {

    public static void main (String[] args) {

        int noOfRegistrations = 2;

        if (noOfRegistrations > 5) {

            System.out.println("There are sufficient registrations. The fishing trip will go ahead.");

        } else {

            System.out.println("The fishing trip will not go ahead. Insufficient numbers.");

        }

    }
}
