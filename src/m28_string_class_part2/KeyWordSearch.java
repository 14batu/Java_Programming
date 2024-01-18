package m28_string_class_part2;

public class KeyWordSearch {
    public static void main(String[] args) {

        String text = "Code without tests is broken by design";
        String keyWord = "DESIGN";

        boolean r = containsKeyWord(text,keyWord);

        System.out.println("r = " + r);

    }

    public static boolean containsKeyWord(String text, String keyWord){

        text = text.toLowerCase();
        keyWord = keyWord.toLowerCase();

        return text.contains(keyWord);

    }
}
