package m21_methods_part2;

public class addNumbers {
    public static void main(String[] args) {

        int result = addNumbers(100,200);
        System.out.println("result = " + result);

    }

    public static int addNumbers(int num1, int num2){
        int num3 = num1 + num2;
        return num3;
    }
}
