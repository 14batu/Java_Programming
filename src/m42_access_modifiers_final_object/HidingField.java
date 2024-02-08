package m42_access_modifiers_final_object;

class Parents{

    public static int a = 100;

    public static void staticMethod(){
        System.out.println("Workds");
    }
}

class SubClass extends Parents{

    public static int a = 1000;
    public static void staticMethod(){
        System.out.println("Worksssss");
    }
}

public class HidingField {
    public static void main(String[] args) {
        Parents.staticMethod();
        SubClass.staticMethod();

        System.out.println(Parents.a);
        System.out.println(SubClass.a);
    }

}
