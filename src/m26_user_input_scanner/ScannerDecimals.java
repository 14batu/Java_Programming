package m26_user_input_scanner;
import java.util.Scanner;

public class ScannerDecimals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number : ");
        float num1 = scanner.nextFloat();

        System.out.println("Enter your second number : ");
        double num2 = scanner.nextDouble();

        System.out.println("Enter True or False : ");
        boolean num3 = scanner.nextBoolean();

        scanner.close();

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);


    }
}
