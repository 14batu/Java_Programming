package m22_methods_part3;

public class ReturnMethodPractice {
    public static void main(String[] args) {


        double calc = calculate(10,'s',2);
        System.out.println("calc = " + calc);
    }


    public static double calculate(double num1, char mathOperator, double num2){

        boolean validOperator = mathOperator == '+' || mathOperator == '-' || mathOperator == '*' || mathOperator == '/';


        double result = 0;

        if (!validOperator){
            System.err.println("Wrong Math Operator");
            return result;
        }
        if (mathOperator == '+' ){
            result = num1 + num2;
        } else if (mathOperator == '-') {
            result = num1 - num2;
        } else if (mathOperator == '*') {
            result = num1 * num2;
        } else if (mathOperator == '/') {
            result = num1/num2;
        }
        return result;

    }
}
