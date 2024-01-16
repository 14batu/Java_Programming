package m25_class_and_object;

public class DogClient {
    public static void main(String[] args) {

        //Dog1 Class
        Dog dog1 = new Dog();

        dog1.name = "Milo";
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.color = "Brown";
        System.out.println("Name = " + dog1.name);
        System.out.println("Breed = " + dog1.breed);
        System.out.println("Color = " + dog1.color);
        System.out.println("Age = " + dog1.age);
        dog1.bark();
        dog1.sleep();
        dog1.eat();

        System.out.println(dog1);
        System.out.println("--------------------------");

        //Dog2 Class
        Dog dog2 = new Dog();

        dog2.name = "Emir";
        dog2.breed = "Cooker";
        dog2.color = "White";
        dog2.age = 3;
        System.out.println(dog2);
        dog2.bark();
        dog2.sleep();
        dog2.eat();
        System.out.println("--------------------------");
        //Dog3 Class
        Dog dog3 = new Dog();

        dog3.name = "Carlos";
        dog3.breed = "Poodle";
        dog3.color = "Yellow";
        dog3.age = 4;
        System.out.println(dog3);
        dog3.eat();
        dog3.sleep();
        dog3.bark();


    }

}
