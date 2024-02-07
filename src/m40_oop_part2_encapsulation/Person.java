package m40_oop_part2_encapsulation;

public class Person {
    private String name;
    private int age;


    public String getName(){
        if (name == null){
            System.err.println("Name cannot be null");
            System.exit(1); // terminate to entire program.
        }
        return name;
    }

    public void setName(String name){
        if (name == null || name.isEmpty() || name.isBlank()){
            System.err.println("Invalid input/data for name: " + name);
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 ){
            System.err.println("Age cannot be negative " + age);
            System.exit(1);
        }
        this.age = age;
    }
}
