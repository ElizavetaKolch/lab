package com.company;

public class UnsupportedOperationException extends Exception {

    private static final long serialVersionUID = 1L;

    public UnsupportedOperationException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    @Override
    public void printStackTrace() {
        super.printStackTrace();
    }
}