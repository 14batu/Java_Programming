package m20_modules_part1;

public class sumOfThreeNumbers {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 50;
        int num3 = 60;
        sumOfNumbers(num1,num2,num3);

    }

    public static void sumOfNumbers (int num1, int num2, int num3){

       int sum = num1 + num2 + num3;
        System.out.println("sum = " + sum);
    }
}
