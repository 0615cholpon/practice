package exceptions;

public class InvalidAgeException extends RuntimeException{

    public InvalidAgeException(){
        super(); // invisible that we don't see.
    }

    public InvalidAgeException(String message){
        super(message);
    }
}
