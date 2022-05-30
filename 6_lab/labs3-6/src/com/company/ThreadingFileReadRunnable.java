package com.company;

import java.io.IOException;

public class ThreadingFileReadRunnable implements Runnable {

    ThreadFileSynchronized object;

    public ThreadingFileReadRunnable(ThreadFileSynchronized object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.printf("Поток %s запущен\n", Thread.currentThread().getName());
        int count = 0;
        try {
            while (count != 10) {
                if (object.getlockR() == false) {
                    object.read();
                    count++;
                }
                Thread.sleep(500);
            }
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            System.out.println("Поток был прерван");
        }
        catch (IOException e) {
            System.out.println("Поток был прерван");
        }

        System.out.printf("\nПоток %s остановлен \n ---------------------------\n\n", Thread.currentThread().getName());
    }
}
