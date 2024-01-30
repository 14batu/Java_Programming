package m32_arrays_part2;

import java.util.Arrays;

public class EmployeeInitial {

    public static void main(String[] args) {
        String[] name = {"John Doe", "Alice Smith", "Robert Johnson"};
        String[] initial = new String[name.length];

        String[] names2 = {"Batuhan Balkilic","Aysun Emir","Ergin Reis"};
        String[] initial2 = initialFinding(names2);
        System.out.println(Arrays.toString(initial2));




        for (int i = 0; i < name.length; i++) {

            initial[i] = name[i].charAt(0) + "." + name[i].charAt(name[i].indexOf(" ") + 1);
        }
        System.out.println(Arrays.toString(initial));
    }

    public static String[] initialFinding(String[] name){
        String[] initial = new String[name.length];

        for (int i = 0; i < name.length; i++) {

            initial[i] = name[i].charAt(0) + "." + name[i].charAt(name[i].indexOf(" ") + 1);
        }
        return initial;
    }
}
