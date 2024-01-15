package m16_loops_part1;

public class FibonacciSequence {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int sum = 0;


        for (int i = 1; i <= 9; i++) {
            System.out.print(num1 + " ");
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;

        }
    }
}
