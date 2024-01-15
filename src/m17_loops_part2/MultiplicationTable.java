package m17_loops_part2;

public class MultiplicationTable {
    public static void main(String[] args) {



        for (int i = 1; i <= 9; i++) {
            System.out.println();
            for (int j = 0; j <= 9; j++) {
                System.out.print(i + " x " + j + " = " + i * j + "\t");
                //System.out.println();
            }

        }

    }
}