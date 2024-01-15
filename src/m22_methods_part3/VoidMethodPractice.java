package m22_methods_part3;

public class VoidMethodPractice {
    public static void main(String[] args) {

        displayGrade(450);

    }


    public static void displayGrade(int score){


        if (score >= 100 || score < 0){
            System.err.println("Invalid score : " + score);
            return;
        }

        if (score >= 90){
            System.out.println("score = A " + score);
        } else if (score >= 80) {
            System.out.println("score = B " + score);
        } else if (score >= 70) {
            System.out.println("score = C " + score);
        } else if (score >= 60) {
            System.out.println("score = D " + score);
        } else{
            System.out.println("score = F " + score);
        }

    }




}
