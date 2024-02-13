package m43_oop_part4_abstraction;

public class Cube extends Shape implements Volume{

    public double side;

    public Cube(double side) {
        this.side = side;
    }


    @Override
    public double calculate_area() {
        return 6 * Math.pow(side,2);
    }

    @Override
    public double volume() {
        return Math.pow(side,3);
    }
}
