package m27_string_class_part1;

public class StringIntro {
    public static void main(String[] args) {

        String s1 = "Wooden Spoon"; // String Literal
        String s2 = "Wooden Spoon"; // String Literal

        System.out.println(s1 == s2); //true


        String s3 = new String("Wooden Spoon");
        String s4 = new String("Wooden Spoon");

        System.out.println(s3 == s4); //false

        System.out.println(s1 == s3); //false

    }
}
