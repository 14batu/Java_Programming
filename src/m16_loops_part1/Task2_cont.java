package m16_loops_part1;

public class Task2_cont {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("sumOdd = " + sumOdd);
        System.out.println("sumEven = " + sumEven);
    }
}
