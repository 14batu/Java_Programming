package m27_string_class_part1;

public class EqualsMethodVsEqualOperator {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1 == str2); // same object. //true
        System.out.println(str1.equals(str2)); // same characters in the same order. // true

        String str3 = new String("Java");
        String str4 =  new String("Java");

        System.out.println(str3 == str4); // same object // false
        System.out.println(str3.equals(str4)); // same characters in the same order. //true

        System.out.println(str1.equals(str4)); //true

        String str5 = "java";

        System.out.println(str1 == str5); // false
        System.out.println(str1.equals(str5)); // false

    }
}
