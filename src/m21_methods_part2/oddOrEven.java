package m21_methods_part2;

public class oddOrEven {
    public static void main(String[] args) {

        String result = oddOrEven(100);
        System.out.println("result = " + result);

    }

    public static String oddOrEven(int number){

        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }
}
