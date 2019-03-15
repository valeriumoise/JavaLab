package Exceptions;

public class MyException extends Exception{

    private String myException;

    /**
     * Constructor for a new exception
     * @param myException exception text
     */
    public MyException(String myException){
        this.myException = myException;
    }

    @Override
    public String toString() {
        return "Custom Exception: "+ myException;
    }
}
