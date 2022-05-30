package com.company;

import com.company.DNS;
import com.company.DNSIterator;

public class Unmodifiable implements DNS {

    private DNS interf;

    public Unmodifiable(DNS interf) {
        this.interf = interf;
    }
    public String[] getBeforVer() {
        return interf.getBeforVer();
    }
    public DNSIterator iterator() {
        return interf.iterator();
    }

    public void setName(String name) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }
    public String getName() {
        return interf.getName();
    }
    public void setManufact(String manufact) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }
    public String getManufact() {
        return interf.getManufact();
    }
    public void setStamp(String stamp) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }
    public String getStamp() {
        return interf.getStamp();
    }
    public void setCoste(int coste) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }
    public int getCoste() {
        return interf.getCoste();
    }
    public void setDay(int day) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }
    public int getDay() {
        return interf.getDay();
    }
    public void setMonth(int month) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }
    public int getMonth() {
        return interf.getMonth();
    }
    public void setYear(int year) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }
    public int getYear() {
        return interf.getYear();
    }

    public void setDate(int day, int month, int year) {
        Exception error = new UnsupportedOperationException("Unsupported Operation");
        error.printStackTrace();
    }

    public String getDate() {
        return interf.getDate();
    }

    @Override
    public String toString() {
        return interf.toString();
    }


}