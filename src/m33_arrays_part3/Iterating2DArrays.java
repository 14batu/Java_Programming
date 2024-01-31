package m33_arrays_part3;

import java.util.Arrays;

public class Iterating2DArrays {
    public static void main(String[] args) {


        int[][] arr2D = {{10,20,30},{40,50,60,70,80},{80,90}};

        for (int i = 0; i < arr2D.length; i++) {
            int[] each1DArray = arr2D[i];
            System.out.println(Arrays.toString(each1DArray));

            for (int i1 = 0; i1 < each1DArray.length; i1++) {
                System.out.println(each1DArray[i1]);
            }

        }
        System.out.println("=================================================");

        for (int[] each1DArray : arr2D) {
            System.out.println(Arrays.toString(each1DArray));

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);

            }

        }
        System.out.println("=================================================");

        for (int i = arr2D.length - 1; i >= 0; i--) {
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.println(arr2D[i][i1]);
            }
        }
        System.out.println("=================================================");


    }
}
