package com.company;

public class ThreadArraySynchronized {
    private ThreadArray object;
    private boolean lockW = false;
    private boolean lockR = true;
    private int indexW = 0;
    private int indexR = 0;
    private int value = 2;

    public ThreadArraySynchronized(ThreadArray object) {
        this.object = object;
    }

    public int getIndexW() {
        return indexW;
    }
    public int getIndexR() {
        return indexR;
    }
    public int getObjectLong () {
        return object.getSize();
    }
    public boolean getLockW() {
        return lockW;
    }
    public boolean getlockR() {
        return lockR;
    }

    public void read() {
        synchronized (object) {
            System.out.printf("\nПрочитал число %s из элемента %s", object.getArray(indexR), indexR);
            indexR++;
        }
        this.lockR = true;
        this.lockW = false;
    }

    public void write() {
        synchronized (object) {
            object.setArray(indexW, value += value);
            System.out.printf("\nЗанёс число %s в элемент %s", value, indexW);
            indexW++;
        }
        this.lockW = true;
        this.lockR = false;
    }
}
