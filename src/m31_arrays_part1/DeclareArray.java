package m31_arrays_part1;

import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {

        int[] scores;
        scores = new int[4];
        scores[0] = 85;
        scores[1] = 25;
        scores[2] = 35;
        scores[3] = 45;

        //System.out.println(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);

        System.out.println("----------------------------------------");

        String[] names = {"java", "Python", "C#","Ruby", "C++"};
        System.out.println(Arrays.toString(names));

    }
}
