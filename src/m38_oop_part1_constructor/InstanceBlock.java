package m38_oop_part1_constructor;

public class InstanceBlock {

    public InstanceBlock(){
        System.out.println("Constructor works..");
    }
    {
        System.out.println("Executed..");
    }

    public static void main(String[] args) {
        InstanceBlock instanceBlock = new InstanceBlock();



    }
}

