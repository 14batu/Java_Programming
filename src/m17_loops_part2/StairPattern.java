package m17_loops_part2;

public class StairPattern {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            System.out.println("#");
        }
    }
}
