package com.company;

import java.io.IOException;

public class ThreadingFileWriteRunnable implements Runnable {

    ThreadFileSynchronized object;

    public ThreadingFileWriteRunnable(ThreadFileSynchronized object) {
        this.object = object;
    }

    @Override
    public void run() {
        System.out.printf("---------------------------\nПоток %s запущен\n", Thread.currentThread().getName());
        int count = 0;
        String arg = "";
        try {
            while (count != 10) {
                if (object.getlockW() == false) {
                    arg = arg + count;
                    object.write(arg);
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

        System.out.printf("\n\nПоток %s остановлен", Thread.currentThread().getName());
    }
}
