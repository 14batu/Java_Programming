package m15_selection_statment_part2;

public class Calculator2 {

    public static void main(String[] args) {

        char operator = '+';

        double n1 = 10;
        double n2 = 20;

        double result = 0;

        switch (operator){
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:{
                System.out.println("Invalid operator");
            }


        }
        System.out.println("result = " + result);
    }
}
