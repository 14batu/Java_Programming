package m12_operators_part2;

public class IncrementDecrement {
    public static void main(String[] args) {

        //Pre Increment and Decrement
        int x = 5;
        int y = ++x;

        System.out.println(y);

        int a = 10;
        int b = --a;
        System.out.println(b);

        //Post Increment and Decrement
        int m = 5;
        int n = m++;

        System.out.println(m);
        System.out.println(n);
    }
}
