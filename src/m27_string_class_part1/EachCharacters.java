package m27_string_class_part1;

public class EachCharacters {
    public static void main(String[] args) {
        eachCharacter("batuhan");
    }

    public static void eachCharacter(String str){

        if (str == null || str.length() == 0){
            System.err.println("the text can not be null or empty");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}
