package m16_loops_part1;

public class Task1 {
    public static void main(String[] args) {

        // even numbers
        for (int i = 1; i <= 10; i ++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // odd numbers
        System.out.print(1);
        for (int i = 3; i <= 19; i +=2) {
                System.out.print("-" + i);

        }
    }
}
