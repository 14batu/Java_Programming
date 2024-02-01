package m35_java_lang_classes;

import java.util.Arrays;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {

        Integer[] numbers =  new Integer[5];
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(Arrays.toString(numbers));

        for (Integer number : numbers) {
            int value = number;
            System.out.println(value);
        }



    }
}
