package m13_operators_part3;

public class Task4 {
    public static void main(String[] args) {
        //example 1

        double mikesAge = 15.5;
        boolean permit = true;
        boolean licence = false;

        boolean result = (mikesAge > 18 && licence) || (mikesAge >= 15.5 && permit == true);

        System.out.println("result = " + result);

        //example 2

        double maryAge = 17;
        boolean permit2 = true;
        boolean licence2 = false;

        boolean result2 = (maryAge > 18 && licence2) || (maryAge > 15.6 && licence2 == true);

        System.out.println("result = " + result2);





    }
}
