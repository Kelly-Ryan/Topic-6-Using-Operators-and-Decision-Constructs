/*
3 December 2018
Kelly Ryan

Exercise 8
• The following table shows the grades that a teacher could give a student on a test.
• Create a Java program, which contains a variable storing a student’s grade.
• The variable should be of type float. Instead of storing a single value I have modified the program to take input
from the command line in order to better facilitate testing of different values.
• Determine the appropriate grade.
• Save the program as JFT6Ex8.java

 */

import java.util.Scanner;

public class JFT6Ex8 {

    public static void main (String[] args) {

        System.out.println("Enter test mark:");

        Scanner keyboard = new Scanner(System.in);
        float gradePercentage = keyboard.nextFloat();
        char letterGrade = 'N';

        //checks that the value entered is valid
        if (gradePercentage >= 0 && gradePercentage <= 100) {

            if (gradePercentage >= 85 && gradePercentage <= 100) {

                letterGrade = 'A';

            } else if (gradePercentage >= 70 && gradePercentage <= 84) {

                letterGrade = 'B';

            } else if (gradePercentage >= 55 && gradePercentage <= 69) {

                letterGrade = 'C';

            } else if (gradePercentage >= 40 && gradePercentage <= 54) {

                letterGrade = 'D';

            } else if (gradePercentage >= 25 && gradePercentage <= 39) {

                letterGrade = 'E';

            } else if (gradePercentage >= 10 && gradePercentage <= 24) {

                letterGrade = 'F';

            }
            else if (gradePercentage >= 0 && gradePercentage <= 9) {

                letterGrade = '-';

                System.out.println("No Grade Achieved.");
            }

            System.out.println("Grade Achieved: "+letterGrade);

        } else {
                                //Displayed if invalid value is entered.
            System.out.println ("Invalid mark. Please enter a valid mark between 0 and 100.");

        }
    }
}
