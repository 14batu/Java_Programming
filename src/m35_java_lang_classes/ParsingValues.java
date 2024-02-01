package m35_java_lang_classes;

public class ParsingValues {
    public static void main(String[] args) {

        String str = "20";

        int num = Integer.parseInt(str);

        Integer num1 = Integer.valueOf(str);

        System.out.println(num);
        System.out.println(num1);


        String str2 = "12.5";
        Double do2 = Double.parseDouble(str2);
        System.out.println(do2);

        Double do3 = Double.valueOf(str2);
        System.out.println(do3);


    }
}
