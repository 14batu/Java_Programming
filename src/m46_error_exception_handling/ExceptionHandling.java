package m46_error_exception_handling;

import java.util.Arrays;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Application started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());
        }catch (RuntimeException e){

            //System.out.println("Unexpected event: catch block executed");
           // e.printStackTrace();
           // System.out.println(Arrays.toString( e.getStackTrace()));
        }finally {
            System.out.println("Finaly works");
        }

        System.out.println("Application ended");
    }
}
