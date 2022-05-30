package com.company;

import java.util.Iterator;

public class DNSIterator implements Iterator<String>{

    private String[] array;
    private int count = 0;

    public DNSIterator(String[] array){
        this.array = array;

    }

    @Override
    public boolean hasNext() {

        if(count < array.length) {
            return true;
        }
        count = 0;
        return false;

    }

    @Override
    public String next() {

        return array[count++];

    }
}