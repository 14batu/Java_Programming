package m14_condition_statements_part1;

public class Grading {
    public static void main(String[] args) {

        int score = 90;
        String result;

        if (score >= 0 && score <= 100){
            if (score < 60){
                result ="Fail";
            } else if (score >= 60 && score < 90) {
                result = "Pass";
            } else {
                result ="pass with distinction";
            }

        } else {
            result = "Invalid Score";
        }

        System.out.println("result = " + result);

    }
}
