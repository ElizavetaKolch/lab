package com.company;
import java.util.Objects;
import com.company.MyExeptions;

public class Motorcycles implements Interface {
    private int[] Owners;
    private String Model;
    private int Year;

    public Motorcycles(int Owners, String Model, int Year) {
        this.Owners = new int[Owners];
        this.Model = Model;
        this.Year = Year;
    }
    public int getLength() {
        return Owners.length;
    }
    public String getModel() {
        return Model;
    }
    public int getYear() {
        return Year;
    }
    public int getInfoOwners() {
        return Owners.length * Year;
    }
    public int getPlacesForOwners() {
        int count = 0;
        for (int i = 0; i<Owners.length; i++) {
            count += Owners[i];
        }
        if (count == 0) {
            count += getInfoOwners();
        }
        return count;
    }

    @Override
    public String toString() {
        return "Название модели: " + getModel()
                + "\nКоличество собственников за год: " + getLength()
                + "\nСрок эксплуатации: " + getYear()
                + "\nКоличество собственников за всё время: " + getInfoOwners()
                + "\nКоличество оставшихся мест для собственников: " + (getPlacesForOwners() - getInfoOwners());
    }
    @Override
    public boolean equals(Object obj) {
        if (obj==this) {
            return true;
        }
        if(obj==null||obj.getClass()!=this.getClass()) {
            return false;
        }
        Motorcycles check = (Motorcycles) obj;
        return Model == check.Model;

    }
    @Override
    public int hashCode() {
        return Objects.hash(getModel());
    }

    public void setOwners(int i, int value) {
        if (value<0) {
            throw new MyExeptions(MyExeptions.c);
        }
        this.Owners[i] = value;
    }
    public void setModel(String Model) {
        this.Model = Model;
    }
    public void setYear(int Year) {
        if (Year > this.Year) {
            throw new MyExeptions(MyExeptions.c);
        }
        this.Year = Year;
    }
}