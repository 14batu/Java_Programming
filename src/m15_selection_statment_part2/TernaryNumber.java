package m15_selection_statment_part2;

public class TernaryNumber {
    public static void main(String[] args) {

        int num = 100;

        String result = (num > 10) ? "positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println("result = " + result);

    }
}
