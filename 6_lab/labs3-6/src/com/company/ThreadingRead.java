package com.company;

import com.company.ThreadArray;

public class ThreadingRead extends Thread{

    private ThreadArray object;

    public ThreadingRead(String name, ThreadArray obj) {
        super(name);
        object = obj;
    }

    public void run() {
        System.out.printf("Поток %s запущен\n",Thread.currentThread().getName());
        try {
            for (int i = 0; i<object.getSize(); i++) {
                System.out.printf("\nПоток %s вывели число из массива: %s", Thread.currentThread().getName(), object.getArray(i));
                Thread.sleep(500);
            }
        }
        catch (InterruptedException e) {
            System.out.println("Поток был прерван");
        }
        System.out.printf("\nПоток %s остановлен", Thread.currentThread().getName());
    }
}
