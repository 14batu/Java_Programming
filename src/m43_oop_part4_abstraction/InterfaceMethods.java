package m43_oop_part4_abstraction;

public interface InterfaceMethods {


    int VAR = 100;

    void abstractMethod();

    static void staticMethod(){
        System.out.println(VAR);
        System.out.println("Static Method");
    }
    default void defaultMethod(){
        System.out.println("Default method");
    }

    private static void  privateMethod(){
        System.out.println("Private method");
    }
}
