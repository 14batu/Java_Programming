package m16_loops_part1;

public class PrintSquareOfNumbers {
    public static void main(String[] args) {
        System.out.println("num1\t|\tnum^2");
        System.out.println("---------------");
        for ( int number = 1; number <= 10; number ++){
            System.out.println(number + "\t|\t  " + (number * number));
        }
    }
}
