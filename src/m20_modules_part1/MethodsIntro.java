package m20_modules_part1;

public class MethodsIntro {
    public static void main(String[] args) {
        eat();
        walk();
        play();
        MethodsIntro.play();
    }

    public static void eat() {
        System.out.println("I am eating");
    }
    public static void walk(){
        System.out.println("i am walking");
    }

    public static void play(){
        walk();
        System.out.println("i am playing");
    }
}

