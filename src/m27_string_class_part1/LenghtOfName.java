package m27_string_class_part1;
import java.util.Scanner;

public class LenghtOfName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name : ");
        String firstName = scanner.next();

        System.out.println("Enter your Last Name: ");
        String  lastName = scanner.next();

        scanner.close();

        int total = firstName.length() + lastName.length();

        System.out.println("Total Characters in your first and last name is : " + total);

    }
}
