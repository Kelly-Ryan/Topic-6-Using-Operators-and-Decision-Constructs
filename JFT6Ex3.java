/*
3 December 2018
Kelly Ryan

Exercise 3
Create another version of the Fisherman’s permit program to comply with the following logic.
A fisherman is only allowed to go on a fishing trip if he holds a fishing permit and is aged over 18.
Create two variables, one to store the permit status (store the value, false) and another to store the age of the person (store the value, 19).
Use a single if statement as part of the solution.
Save the program as JFT6Ex3.java
 */

public class JFT6Ex3 {

    public static void main (String[] args) {

        boolean hasPermit = true;
        int age = 19;

        if ((hasPermit) && (age > 18)){

            System.out.println("You meet the qualifying criteria to go on the fishing trip.");
        } else {

            System.out.println("You cannot go on the fishing trip as you do not meet the qualifying criteria.");
        }
    }
}
