package m12_operators_part2;

public class ShorthandOperators {

    public static void main(String[] args) {

        // additional assignment operators:

        int x = 5;
        System.out.println("x = " + x);

        x += 5; // x = x + 5

        System.out.println("x = " + x);
        // subtraction
        int y = 10;

        y -= 5;

        System.out.println("y = " + y);


        // Multiplication

        int z = 15;

        z *= z;
        System.out.println("z = " + z);

        //division

        int v = 10;

        v /= 2;

        System.out.println("v = " + v);

        // Module

        int b = 10;
        b %= 3;
        System.out.println("b = " + b);

        //different date type

        int c = 4;

        c += 20.5;

        System.out.println("c = " + c);



    }
}
