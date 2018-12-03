/*
3 December 2018
Kelly Ryan

Exercise 10
Create a variable named, dayOfWeek, in the main method. The variable should be of type, String.
Assign the value "Monday" to the variable. Use a switch statement to test the value stored in the
variable and display it in the console.
Save the program as JFT6Ex10.java
 */

public class JFT6Ex10 {

    public static void main (String[] args) {


        int x = 10;
        int y = 12;

        String dayOfWeek = "Monday";

        switch (dayOfWeek) {

            case "Monday":

                System.out.println("The day is Monday.");
                break;

            case "Tuesday":

                System.out.println("The day is Tuesday.");
                break;

            case "Wednesday":

                System.out.println("The day is Wednesday.");
                break;

            case "Thursday":

                System.out.println("The day is Thursday.");
                break;

            case "Friday":

                System.out.println("The day is Friday.");
                break;

            case "Saturday":

                System.out.println("The day is Saturday.");
                break;

            case "Sunday":

                System.out.println("The day is Sunday.");
                break;

            default:

                System.out.println("Invalid day.");

        }
    }
}

