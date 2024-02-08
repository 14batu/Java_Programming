package m41_oop_part3_inheritance.method_overriding;

public class EmployeeClient {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Batuhan",31,100_000);
        Driver driver = new Driver("Zulfiye",25,67_000);
        Developer developer = new Developer("Emir",26,150_000);


        System.out.println(teacher);
        System.out.println(driver);
        System.out.println(developer);

        teacher.work();
        driver.work();
        developer.work();
    }
}
