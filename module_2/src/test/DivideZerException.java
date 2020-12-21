package test;

public class DivideZerException extends ArithmeticException {
    private String message;
    public DivideZerException(String message){
        super(message);
    }
}
