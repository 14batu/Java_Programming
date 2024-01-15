package m20_modules_part1;

public class EmployeeInfo {
    public static void main(String[] args) {

        displayEmployeeInfo("Batu",31,"Maryland");

        String name = "Aysun";
        int age = 32;
        String city = "Dc";

        System.out.println("------------------------");

        displayEmployeeInfo(name,age,city);

    }

    public static void displayEmployeeInfo(String name, int age, String city){
        System.out.println("Employee name = " + name);
        System.out.println("age = " + age);
        System.out.println("city = " + city);

    }
}
