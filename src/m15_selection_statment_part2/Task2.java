package m15_selection_statment_part2;

public class Task2 {
    public static void main(String[] args) {

        char color = 'G';

        switch (color){
            case 'r','R' -> System.out.println("Red");
            case 'y','Y' -> System.out.println("Yellow");
            case 'g','G' -> System.out.println("Green");
            default -> System.out.println("Wrong Input");
        }
    }
}
