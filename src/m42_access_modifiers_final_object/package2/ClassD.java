package m42_access_modifiers_final_object.package2;

import m42_access_modifiers_final_object.package1.ClassA;

public class ClassD extends ClassA{

    public static void main(String[] args) {
        System.out.println(ClassA.a);
        System.out.println(ClassA.b);
        //System.out.println(ClassA.c);
        //System.out.println(ClassA.d); private
    }
}
