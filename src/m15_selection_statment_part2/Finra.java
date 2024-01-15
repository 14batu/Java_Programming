package m15_selection_statment_part2;

public class Finra {

    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 5;

        int finalNumber = 10;

        if (finalNumber % num1 == 0 && finalNumber % num2 == 0){
            System.out.println("FINRA");
        } else if (finalNumber % num1 == 0 && finalNumber % num2 != 0) {
            System.out.println("FIN");
        } else if (finalNumber % num1 != 0 && finalNumber % num2 == 0) {
            System.out.println("RA");
        }else {
            System.out.println("Wrong input");
        }

    }
}
