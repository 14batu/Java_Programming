package m32_arrays_part2;

public class FindMaxNumber {
    public static void main(String[] args) {

        int[] x = {10,2,3,40,20};
        System.out.println(maxValue(x));

    }

    public static int maxValue (int[] numbers){
        if (numbers == null || numbers.length == 0){
            System.out.println("Array is empty");
            return 0;
        }

        int max = numbers[0];



        for (int number : numbers) {
            if (number > max){
                max = number;
            }
        }
        return max;
    }
}
