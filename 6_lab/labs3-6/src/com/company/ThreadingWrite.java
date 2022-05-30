package com.company;

import com.company.ThreadArray;

public class ThreadingWrite extends Thread{

    private int value = 2;
    private ThreadArray object;

    public ThreadingWrite(String name, ThreadArray obj) {
        super(name);
        object = obj;
    }

    public void run() {
        System.out.printf("Поток %s запущен\n",Thread.currentThread().getName());
        try {
            for (int i = 0; i<object.getSize(); i++) {
                value += value;
                object.setArray(i, value);
                System.out.printf("\nПоток %s внёс число %s в массив", Thread.currentThread().getName(), value);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Поток был прерван");
        }
        System.out.printf("\nПоток %s остановлен", Thread.currentThread().getName());
    }
}