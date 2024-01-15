package m20_modules_part1;

public class PassByValue {
    public static void main(String[] args) {

        int a = 5;
        displayCube(a);

    }

    public static void displayCube(int num){
        System.out.println("The number is =  " + num);
        num = num * num * num;
        System.out.println("Cube is = " + num);
    }
}
