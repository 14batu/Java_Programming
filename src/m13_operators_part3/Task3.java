package m13_operators_part3;

public class Task3 {
    public static void main(String[] args) {
        int appleCount = 10;
        int orangeCount = 15;
        int strawberryCount = 20;
        boolean result = (appleCount < orangeCount) || (orangeCount >= strawberryCount);

        System.out.println("result = " + result);
    }
}
