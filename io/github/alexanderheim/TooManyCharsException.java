package io.github.alexanderheim;

public class TooManyCharsException extends Exception {

    public TooManyCharsException(String s){
        super(s);
    }
}
