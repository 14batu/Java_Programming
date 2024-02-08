package m41_oop_part3_inheritance.super_keyword;

public class Student extends Person {

    public String schoolName;
    public String studentID;

    public Student(String name,int age,String gender,String schoolName,String studentID){
        super(name,age,gender);
        this.schoolName = schoolName;
        this.studentID = studentID;
    }

    

}
