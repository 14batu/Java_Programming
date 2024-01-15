package m14_condition_statements_part1;

public class Task4 {
    public static void main(String[] args) {
        int avarage = 100;

        if (avarage >= 0 && avarage < 59) {
            System.out.println("F");
        } else if (avarage >= 60 && avarage <= 69) {
            System.out.println("D");
        } else if (avarage >= 70 && avarage <= 79) {
            System.out.println("C");
        } else if (avarage >= 80 && avarage <= 89) {
            System.out.println("b");
        } else {
            System.out.println("A");
        }
    }
}
