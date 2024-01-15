package m18_loops_part3;

public class DoWhileLoop {

    public static void main(String[] args) {
        int n = 100;
        while (n < 0) {
            System.out.println("While loop");
        }

        do {
            System.out.println("do- while loop");
        }while (n < 100);

        System.out.println("-----------------");

        int x = 0;
        do {
            System.out.print(x + " ");
            x++;
        }while (x < 11);

    }
}
