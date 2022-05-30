package com.company;

public class ThreadArray {
    private int[] Array = new int[10];

    public int getArray(int i) {
        return Array[i];
    }

    public void setArray(int i, int j) {
        Array[i] = j;
    }

    public int getSize() {
        return Array.length;
    }
}

