package m28_string_class_part2;

public class ReplaceTrim {
    public static void main(String[] args) {

        String str = "Apple Apple Apple";

        str = str.replace("Apple","Cherry");
        System.out.println("newStr = " + str);

        str =str.replaceFirst("Cherry","Grape");
        System.out.println("str = " + str);

        //trim

        String s = "         Cydeo Schooll         ";
        s = s.trim();
        System.out.println("s = " + s);



    }
}
