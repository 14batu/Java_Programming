package m26_user_input_scanner;
import java.util.Scanner;

public class ScannerIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number: ");
        byte firstNum = scanner.nextByte(); //Byte

        System.out.println("Enter your second number: ");
        short secondNum = scanner.nextShort(); //Short

        System.out.println("Enter your third Number: ");
        int thirdNum =  scanner.nextInt(); //Int

        System.out.println("Enter your forth Number: ");
        long forthNum =  scanner.nextLong(); //Long

        scanner.close();

        System.out.println("firstNum = " + firstNum);
        System.out.println("secondNum = " + secondNum);
        System.out.println("thirdNum = " + thirdNum);
        System.out.println("forthNum = " + forthNum);
    }
}
