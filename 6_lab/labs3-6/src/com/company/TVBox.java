package com.company;

import com.company.DNS;
import com.company.DNSIterator;

public class TVBox implements DNS{

    private String name;
    private String stamp;
    private String manufact;
    private String[] beforVer;
    private int coste;
    private int day;
    private int month;
    private int year;


    public TVBox() {}
    public TVBox(String[] args) {
        this.beforVer = args;
    }

    public String[] getBeforVer() {
        return beforVer;
    }
    public DNSIterator iterator() {

        DNSIterator object = new DNSIterator(getBeforVer());
        return object;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setManufact(String manufact) {
        this.manufact = manufact;
    }
    public String getManufact() {
        return manufact;
    }
    public void setStamp(String stamp) {
        this.stamp = stamp;
    }
    public String getStamp() {
        return stamp;
    }
    public void setCoste(int coste) {
        this.coste = coste;
    }
    public int getCoste() {
        return coste;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }

    public void setDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public String getDate() {
        return getDay() + "." + getMonth() + "." + getYear();
    }

    @Override
    public String toString() {
        return "\nТелевизор компании : " + getManufact()
                + "\nМарка: " + getStamp()
                + "\nНазвание: " + getName()
                + "\nДата производства: " + getDate()
                + "\nЦена: " + getCoste();
    }
}
