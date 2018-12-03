public class LogicalOperators3 {

    public static void main (String[] args) {

        int y = 2;
        int z = y++; // z = 3

        //   3 > 2 | 4 > 2 - ++z executes before --z
        if(--z > 2 | ++z > 2) --z; ++y; //z = 2 y = 4

        System.out.println(z);
        System.out.println(y);

    }
}
