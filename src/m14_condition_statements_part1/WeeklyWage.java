package m14_condition_statements_part1;

public class WeeklyWage {
    public static void main(String[] args) {

        double wage = 900;
        int hours = 45;

        if (hours > 40) {
            wage *= 1.5;
            System.out.println("wage = " + wage);
        }
    }
}
