package m28_string_class_part2;

public class MutubaleSequanceOfCharacters {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(17);

        System.out.println("stringBuilder = " + stringBuilder);

        stringBuilder.reverse();
        System.out.println("stringBuilder = " + stringBuilder);

        String result = stringBuilder.toString();
        System.out.println("result = " + result);

        StringBuffer stringBuffer = new StringBuffer("Java");

        stringBuffer.append("programming");
        stringBuffer.reverse();
        String result2 = stringBuffer.toString();





    }
}
