package m44_oop_part5_poly;

import m43_oop_part4_abstraction.*;

public class PolyIntro {
    public static void main(String[] args) {
        Shape circle = new Circle(3.5);
        System.out.println(circle);

        Shape rectangle =  new Rectangle(3,4);
        System.out.println(rectangle);

        Shape cube = new Cube(7);
        System.out.println(cube);

        Volume obj = new Cube(9);
        System.out.println(obj);

        displayAreaOfShape(circle);
        displayAreaOfShape(cube);
    }
    public static void displayAreaOfShape(Shape shape){
        System.out.println("Area of " + shape.name + " is a " + shape.calculate_area());
    }
}
