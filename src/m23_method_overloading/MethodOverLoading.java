package m23_method_overloading;

public class MethodOverLoading {

    public static void main(String[] args) {
        displayValue(10);
        displayValue(10.2);
        displayValue(10.2,3);
        displayValue(5,2.5);
    }
    public static void  displayValue(int a){
        System.out.println("First Method");
    }

    public static void displayValue(double a){
        System.out.println("Second Method");
    }

    public  static void displayValue(int a , double b){
        System.out.println("Third Method");
    }

    public static void displayValue(double a ,int b){

        System.out.println("Fourth Method");

    }
}
