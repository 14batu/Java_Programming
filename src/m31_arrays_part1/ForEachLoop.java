package m31_arrays_part1;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {15,30,45,60,75,90};

        for(int each : numbers){
            System.out.println(each);
        }

        System.out.println("-----------------------------");



        String[] names = {"Batu","Emir","Aysun","Ergin"};

        for (String name : names) {
            System.out.println(name);
        }

    }
}
