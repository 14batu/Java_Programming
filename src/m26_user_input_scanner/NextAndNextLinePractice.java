package m26_user_input_scanner;
import java.util.Scanner;

public class NextAndNextLinePractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter your full name : ");
        String fullName = scanner.nextLine();

        scanner.close();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

    }
}
