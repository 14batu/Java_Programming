package m38_oop_part1_constructor;

public class ConstructorIntro {

    public ConstructorIntro(){
        System.out.println("It works");
    }
    public ConstructorIntro(int a){
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {

        ConstructorIntro constructorIntro =  new ConstructorIntro();
        ConstructorIntro constructorIntro1 = new ConstructorIntro(10);

    }
}
