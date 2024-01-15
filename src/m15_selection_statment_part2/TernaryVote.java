package m15_selection_statment_part2;

public class TernaryVote {
    public static void main(String[] args) {

        int age = 28;

        String result = (age >= 18) ? "you are eligible to vote" : "You are Not eligible to vote";

        System.out.println("result = " + result);
    }
}
