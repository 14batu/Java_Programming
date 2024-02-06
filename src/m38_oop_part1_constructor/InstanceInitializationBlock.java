package m38_oop_part1_constructor;

public class InstanceInitializationBlock {

    public String name;
    public int age;

    {
        name = "unknown";
        age = 10;
    }

    public static void main(String[] args) {
        InstanceInitializationBlock obj1 = new InstanceInitializationBlock();
        System.out.println(obj1.name + "\n" + obj1.age);
    }
}
