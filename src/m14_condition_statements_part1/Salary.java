package m14_condition_statements_part1;

public class Salary {
    public static void main(String[] args) {

        int salary = 50000;
        int yearsOnJob = 2;

        if (salary >= 30000) {
            if (yearsOnJob >= 2){
                System.out.println("You are qualified for the loan");
            } else {
                System.out.println("you are NOT qualified for the loan");
            }
        } else {
            System.out.println("You must earn at least $30,000 per year");
        }
    }
}
