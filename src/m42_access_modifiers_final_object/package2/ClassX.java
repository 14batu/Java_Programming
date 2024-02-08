package m42_access_modifiers_final_object.package2;

import m42_access_modifiers_final_object.package1.ClassA;

public class ClassX {
    public static void main(String[] args) {
        System.out.println(ClassA.a);
        //System.out.println(ClassA.b); protected
        //System.out.println(ClassA.c); default
        //System.out.println(ClassA.d); private
    }
}
