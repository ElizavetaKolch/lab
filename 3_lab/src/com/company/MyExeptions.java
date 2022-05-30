package com.company;

public class MyExeptions extends RuntimeException {

    public static final String c = "Вы вышли из диапазона допустимых значений.";

    public MyExeptions(String message) {
        super(message);
    }
}
