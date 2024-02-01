package m35_java_lang_classes;

public class WrapperClassesIntro {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1234);
        System.out.println(num1);

        Integer num2 = Integer.valueOf("25");
        System.out.println(num2 + 5);

        Double num3 = Double.valueOf(2.5);
        System.out.println(num3);

        Double num4 = Double.valueOf("3.5");
        System.out.println(num4);

        Boolean num5 = Boolean.valueOf(true);
        System.out.println(num5);

        Boolean num6 = Boolean.valueOf("false");
        System.out.println(num6);
    }
}
