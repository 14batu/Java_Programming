package m28_string_class_part2;

public class IndexOfLastIndexOf {
    public static void main(String[] args) {

        String str = "Java Programming Language";

        int num = str.indexOf("a");

        System.out.println(num);

        int indexOfSecondA = str.indexOf("a P");

        System.out.println("indexOfSecondA = " + indexOfSecondA);

        int num2 = str.indexOf("a",5);
        System.out.println("num2 = " + num2);

        int num3 = str.indexOf("a",num2 + 1);
        System.out.println("num3 = " + num3);
    }
}
