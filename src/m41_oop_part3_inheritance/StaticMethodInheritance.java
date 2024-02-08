package m41_oop_part3_inheritance;


class ClassA{
    public static int a = 100;

    public static void method(){
        System.out.println("parent class static method");
    }
}

class ClassB extends ClassA{

    public static void method(){
        System.out.println("child class static method");
    }

}

public class StaticMethodInheritance {

    public static void main(String[] args) {

        System.out.println(ClassA.a);
        System.out.println(ClassB.a);

        ClassA.method();
        ClassB.method();

    }





}
