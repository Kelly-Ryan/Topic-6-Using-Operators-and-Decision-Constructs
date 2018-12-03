public class LogicalOperators {

    public static void main (String[] args) {

        int z = 5;

        //   6 > 5 || 7 > 6
        if(z++ > 5 || ++z > 6) {

            z++; //8

        }

        System.out.print(z);
    }
}
