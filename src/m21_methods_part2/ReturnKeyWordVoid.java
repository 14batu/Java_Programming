package m21_methods_part2;

public class ReturnKeyWordVoid {
    public static void main(String[] args) {

        eligibletoVote(19);

    }

    public static void eligibletoVote(int age){

        if (age < 0 || age > 150){
            System.out.println("Invalid age");
            return;
        }

        if (age > 18){
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
    }
}
