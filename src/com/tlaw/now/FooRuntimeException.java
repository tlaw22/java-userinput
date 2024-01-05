package com.tlaw.now;

public class FooRuntimeException extends Exception {
    public FooRuntimeException(String message) {
        super(message);
    }

    public int Subtract10(int number) throws Exception {
        if (number < 10) {
            throw new Exception("Error! - Get to fixing this shit");
        }
        return number - 10;
    }
}
