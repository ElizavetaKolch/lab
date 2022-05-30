package com.company;

import com.company.ThreadArraySynchronized;

public class ThreadingReadRunnable implements Runnable {

    ThreadArraySynchronized object;

    public ThreadingReadRunnable(ThreadArraySynchronized object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.printf("Поток %s запущен\n", Thread.currentThread().getName());
        try {
            while(object.getIndexR() < object.getObjectLong()) {
                if(object.getlockR()==false) {
                    object.read();
                }
                Thread.sleep(500);
            }
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
            System.out.println("Поток был прерван");
        }
        System.out.printf("\nПоток %s остановлен\n---------------------------\n\n", Thread.currentThread().getName());
    }
}
