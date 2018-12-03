/*
3 December 2018
Kelly Ryan

Exercise 9
• Write a Java program to model an air conditioning system. Assume that the current
temperature is 14.19 degrees centigrade. Store this information in a variable. Test the value
stored in the variable. Display an appropriate message to the user, as per the table below.
Test your program with different temperatures.

 */

public class JFT6Ex9 {

    public static void main (String[] args) {

        float degreesCentigrade = -2f;
        String str = "";

        if (degreesCentigrade >= 20) {

            str = "tropical temperature";

        } else if (degreesCentigrade >= 10 && degreesCentigrade <= 19) {

            str = "warm temperature";

        } else if (degreesCentigrade >= 0 && degreesCentigrade <= 9) {

            str = "moderate temperature";

        } else if (degreesCentigrade >= -4 && degreesCentigrade <= -1) {

            str = "cold temperature";

        } else if (degreesCentigrade <= -5) {

            str = "arctic temperature";
        }

        System.out.println(str);
    }

}
