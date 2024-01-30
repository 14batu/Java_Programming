package m33_arrays_part3;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60};
        int[] arr3 = {80,90};

        int[][] numbers = new int[3][];

        numbers[0] = arr1;
        numbers[1] = arr2;
        numbers[2] = arr3;

        System.out.println(Arrays.deepToString(numbers));
        System.out.println(Arrays.toString(numbers[1]));

        System.out.println(numbers[1][1]);
        System.out.println(numbers[2][0]);
     }
}
