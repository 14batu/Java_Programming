package m14_condition_statements_part1;

public class Watermelon {
    public static void main(String[] args) {

        int number = 40;
        boolean isEnough = false;

        if (number >= 20){
            System.out.println("I have more than 20 watermelon");
            isEnough =true;
        }

        if (isEnough){
            System.out.println("good job");
        }

        if (!isEnough){
            System.out.println("I need more watermelon");
        }
    }
}
