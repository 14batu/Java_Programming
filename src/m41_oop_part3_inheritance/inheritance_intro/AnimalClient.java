package m41_oop_part3_inheritance.inheritance_intro;

public class AnimalClient {
    public static void main(String[] args) {

        Dog dog = new Dog("milo","husky","male",5,"black");
//        dog.setName("milo");
//        dog.setAge(5);
//        dog.setBreed("Husky");
        dog.eat();

        Cat cat = new Cat("lusy","cat","female",2,"white");
//        cat.setName("Lisa");
//        cat.setColor("Black");
        cat.sleep();

        System.out.println(cat);
        System.out.println(dog);
    }
}
