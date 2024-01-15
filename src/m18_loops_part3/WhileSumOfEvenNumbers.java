package m18_loops_part3;

public class WhileSumOfEvenNumbers {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while (num <= 10){
            if (num % 2 == 0){
               sum += num;
            }
            num++;
        }
        System.out.println(sum);
    }
}
