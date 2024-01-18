package m27_string_class_part1;

public class ConcatLowerAndUpperCase {
    public static void main(String[] args) {
        String str = "Cydeo";
        str.concat("School");

        str = str.concat("School");

        System.out.println(str);

        String str1 = "Hello, World";

        String lowerCaseStr = str.toLowerCase();
        System.out.println(lowerCaseStr);

        String upperCaseStr = str1.toUpperCase();
        System.out.println(upperCaseStr);

    }
}
