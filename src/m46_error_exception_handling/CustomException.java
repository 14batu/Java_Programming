package m46_error_exception_handling;


class InvalidException extends RuntimeException{
    public InvalidException(){
        super("Invalid exception called");
    }

    public InvalidException(String message){
        super(message);
    }
}
public class CustomException {

    public static void main(String[] args) {

        //throw new InvalidException();

        throw new InvalidException("Age is nat valid");



    }
}
