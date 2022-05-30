package com.company;

import com.company.ThreadArraySynchronized;

public class ThreadingWriteRunnable implements Runnable {

    ThreadArraySynchronized object;

    public ThreadingWriteRunnable(ThreadArraySynchronized object){
        this.object = object;
    }

    @Override
    public void run() {
        System.out.printf("\n\n-----------------------------\nПоток %s запущен...\n", Thread.currentThread().getName());
        try {
            while(object.getIndexW()<object.getObjectLong()) {
                if(object.getLockW()==false) {
                    object.write();
                }
                Thread.sleep(500);
            }
            Thread.sleep(500);
        }
        catch(InterruptedException e) {
            System.out.println("Поток был прерван.");
        }
        System.out.printf("\n\nПоток %s остановлен..", Thread.currentThread().getName());
    }
}