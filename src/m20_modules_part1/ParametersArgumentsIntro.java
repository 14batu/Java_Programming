package m20_modules_part1;

public class ParametersArgumentsIntro {
    public static void main(String[] args) {

        int age = 19;
        eligibleVote(age);

    }
    public static void eligibleVote(int age){

        if (age >= 18){
            System.out.println("Your are eligbile to vote");
        } else {
            System.out.println("You are not eligible to vote");
        }


    }
}
