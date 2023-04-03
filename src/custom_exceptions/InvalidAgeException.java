package custom_exceptions;

public class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}
