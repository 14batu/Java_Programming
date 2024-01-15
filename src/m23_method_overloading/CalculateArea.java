package m23_method_overloading;

public class CalculateArea {
    public static void main(String[] args) {

        double areaOfCircle = calculateArea(2.5);
        double areaOfCircle2 = calculateArea(2.5,3.1);
        System.out.println("areaOfCircle = " + areaOfCircle);
        System.out.println("areaOfCircle2 = " + areaOfCircle2);


    }

    public static double calculateArea (double radius){
        return radius * radius * 3.14;
    }
    public static double calculateArea (double lenght, double width){
        return lenght * width;
    }
}
