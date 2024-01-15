package m15_selection_statment_part2;

public class Task1 {
    public static void main(String[] args) {

        String laptop = "apple";

        switch (laptop){
            case "apple":
                System.out.println("apple -no virus");
                break;
            case "dell":
                System.out.println("Tough one");
                break;
            case "hp":
                System.out.println("Not Recommended");
                break;
            default:
                System.out.println("Do not buy that one!");
        }
    }
}
