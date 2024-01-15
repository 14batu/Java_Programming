package m18_loops_part3;

public class FinraPattern {

    public static void main(String[] args) {

        int num = 1;


        do {
            if(num % 3 == 0){
                System.out.println("FIN ");
            } else if (num % 5 == 0) {
                System.out.println("Ra ");
            } else if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FINRA ");
            } else {
                System.out.println(num);
            }

            num++;

        }while (num <= 20);

    }
}
