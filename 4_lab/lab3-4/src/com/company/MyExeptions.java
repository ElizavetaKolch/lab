package com.company;

public class MyExeptions extends RuntimeException {

    public static final String c = "Число неправильного формата.";

    public MyExeptions(String message) {
        super(message);
    }
}
