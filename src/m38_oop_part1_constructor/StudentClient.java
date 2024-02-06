package m38_oop_part1_constructor;

public class StudentClient {

    public static void main(String[] args) {
        Student student = new Student("Batuhan",31);

        System.out.println(student.name);
        System.out.println(student.age);

        Student student1 = new Student();
        System.out.println("student1 = " + student1);
        System.out.println("student = " + student);

        Student student2 = new Student("Batuhan",31,"Male",3.5);
        System.out.println(student2);

    }



}
