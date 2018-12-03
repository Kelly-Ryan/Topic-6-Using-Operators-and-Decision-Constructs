/*
3 December 2018
Kelly Ryan

Exercise 7
Write a Java program to determine if a salesperson is entitled to a commission bonus or not.
A salesperson is entitled to a bonus, if he/she has sold 1,000 or more products, has 20 or
more years’ service and has accumulated sales for the year to date of €10,000 or over.
Make use of variables as part of your solution and store sample values. Test your solution.
Save the program as JFT6Ex7.java

 */

public class JFT6Ex7 {

    public static void main (String[] args) {

        int productsSold = 1000;
        int yearsService = 20;
        double accumulatedSalesValue = 9000;

        String str = (productsSold>=1000 && yearsService>=20 && accumulatedSalesValue>=10000) ? ("You have qualified for a bonus!") : ("You have not qualified for a bonus.");

        System.out.println(str);
    }
}
