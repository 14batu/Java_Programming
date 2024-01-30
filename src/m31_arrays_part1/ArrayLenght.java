package m31_arrays_part1;

public class ArrayLenght {
    public static void main(String[] args) {


        String[] names = {"James", "Aaron", "Yulia", "Hazel"};

        int lengthOfArray = names.length;
        System.out.println("lengthOfArray = " + lengthOfArray);

        int lastIndex = lengthOfArray - 1;
        System.out.println("lastIndex = " + lastIndex);

        System.out.println(names[lastIndex]);

        int numbers[] = {10,20,30,40,50,60,70};

        /*

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        */

        for (int i = numbers.length -1 ; i >= 0; i--) {
            System.out.println(numbers[i]);

        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

    }
}
