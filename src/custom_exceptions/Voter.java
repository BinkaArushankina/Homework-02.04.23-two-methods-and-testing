package custom_exceptions;

public class Voter {
    public static void main(String[] args) //throws InvalidAgeException{
    {
        try {
            validate(12);
        }catch (InvalidAgeException exception){
            System.out.println("Exception occured: "+exception);
        }
        System.out.println("The rest of code");
    }
    static void validate (int age)throws InvalidAgeException{
        if(age<18){

            throw new InvalidAgeException("age is not valid to vote");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }
}
