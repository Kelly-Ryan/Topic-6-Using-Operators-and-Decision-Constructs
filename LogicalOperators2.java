public class LogicalOperators2 {

    public static void main (String[] args) {

        int y = 5;
        int z = y++; //z = 6

        //6 > 5 | 7 > 6 (++z happens before --z and they both happen before the if statement)
        if(--z > 5 | ++z > 6)

            --z; //

        System.out.print(z); // z = 5
    }
}

// What is the value of z? 5