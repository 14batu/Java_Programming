package m16_loops_part1;

public class Task2 {
    public static void main(String[] args) {

        int sumOfOdd = 0;
        int sumOfEven = 0;

        for (int i = 0; i <= 10; i+=2) {
            sumOfEven += i;
        }
        for (int i = 1; i <= 10; i+=2) {
            sumOfOdd += i;
        }

        System.out.println("sumOfEven = " + sumOfEven);
        System.out.println("sumOfOdd = " + sumOfOdd);
    }
}
