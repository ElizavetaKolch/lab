package com.company;

import com.company.DNSIterator;

public interface DNS {


    public void setName(String name);
    public void setManufact(String manufact);
    public void setStamp(String stamp);
    public void setCoste(int coste);
    public void setDay(int day);
    public void setMonth(int month);
    public void setYear(int year);
    public void setDate(int day, int month, int year);

    public String[] getBeforVer();
    public String getName();
    public String getManufact();
    public String getStamp();
    public int getCoste();
    public int getDay();
    public int getMonth();
    public int getYear();
    public String getDate();
    public String toString();
    public DNSIterator iterator();
}
