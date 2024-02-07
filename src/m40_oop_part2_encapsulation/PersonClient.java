package m40_oop_part2_encapsulation;

public class PersonClient {
    public static void main(String[] args) {
        Person person = new Person();



        person.setName("Batuhan");
        System.out.println(person.getName());

        person.setAge(-12);
        System.out.println(person.getAge());

    }
}
