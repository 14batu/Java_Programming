package m26_user_input_scanner;
import java.util.Scanner;

public class MistakeNext {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstName, lastName;

        System.out.println("Write your FirstName: ");
        firstName = scanner.next();

        scanner.nextLine(); //enter key

        System.out.println("Write your LastName :");
        lastName = scanner.nextLine();

        scanner.close();

        System.out.println(firstName + " " + lastName);

    }
}
