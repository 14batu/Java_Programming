package m13_operators_part3;

public class Task2 {

    public static void main(String[] args) {

        // example 1
        int input = 1982;
        int year = 2024;
        int currentAge = year - input;
        boolean result = (currentAge > 18 && currentAge < 65);
        System.out.println("Am i eligible to work : " + result);

        //example 2

        int input2 = 1957;
        int year2 = 2024;
        int currentAge2 = year2 - input2;
        boolean result2 = (currentAge2 > 18 && currentAge2 < 65);
        System.out.println("Am i eligible to work : " + result2);



    }
}
