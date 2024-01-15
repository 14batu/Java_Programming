package m13_operators_part3;

public class Task1 {
    public static void main(String[] args) {
        int b = 2;
        boolean result = (++b == 2 || b == 2) && --b == 2;

        System.out.println("result = " + result);
        System.out.println(b);
    }


}
