package m38_oop_part1_constructor;

class Apple {
    String color = "Red";

}

public class PassingObjectToMethod {
    public static void main(String[] args) {

        Apple apple = new Apple();
        System.out.println(apple.color);

        changeApple(apple);
        System.out.println(apple.color);


    }


    public static void changeApple(Apple apple ){
        apple.color = "White";
    }

}
