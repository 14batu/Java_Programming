package m35_java_lang_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {

        char ch = 'a';

        boolean isDigit = Character.isDigit(ch);
        System.out.println(isDigit);

        boolean isLetter = Character.isLetter(ch);
        System.out.println(isLetter);

        boolean isUpper = Character.isUpperCase(ch);
        System.out.println(isUpper);

        boolean isLower = Character.isLowerCase(ch);
        System.out.println(isLower);


        String str = "a1b2c3$@1";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)){
                System.out.println(c);
            }
        }





    }
}
