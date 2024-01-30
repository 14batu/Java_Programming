package m32_arrays_part2;

import java.util.Arrays;

public class ReverseArrayElements {

    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};
        int[] result = reverseArray(numbers);
        System.out.println(Arrays.toString(result));
        
        String[] num1 = {"Java","Batu","Emir"};
        String[] result2 = reverseArray(num1);
        System.out.println(Arrays.toString(result2));
    }

    public static int[] reverseArray(int[] array){

        if (array.length <= 1 ){
            return  array;
        }

        int[] reverseArray = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }

        return reverseArray;


    }
    public static String[] reverseArray(String[] array){

        if (array.length <= 1 ){
            return  array;
        }

        String[] reverseArray = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--,j++) {
            reverseArray[j] = array[i];
        }

        return reverseArray;


    }
}
