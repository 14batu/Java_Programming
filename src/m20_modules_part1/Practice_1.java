package m20_modules_part1;

public class Practice_1 {
    public static void main(String[] args) {

        int number = 45;
        oddOrEven(number);

    }

    public static void oddOrEven(int number){
        if (number % 2 == 0){
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }
}
