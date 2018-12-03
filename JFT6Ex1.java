/*
Kelly Ryan
3 December 2018
Topic 6 - Using Operators and Decision Constructs

Exercise 1
A fisherman will be allowed to go on a fishing trip, if he is in possession of a fishing permit.
Create a Java program which creates a boolean variable named hasPermit and assign it a
value of true.
Use an if-else statement to test the value of the variable and output a suitable message to
the console.
Save the program as JFT6Ex1.java

 */

public class JFT6Ex1 {

    public static void main (String[] args) {

        boolean hasPermit = true;

        //"hasPermit == true" can be simplified to "hasPermit". Similarly, "hasPermit != true" can be simplified to "!hasPermit".
        if(hasPermit) {

            System.out.println("You can go on the fishing trip as you have a permit.");

        } else {

            System.out.println("You cannot go on the fishing trip as you do not have a permit.");
        }

    }
}
