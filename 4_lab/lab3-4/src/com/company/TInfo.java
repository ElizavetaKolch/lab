package com.company;

import java.io.Serializable;
import java.util.Arrays;

public class TInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String[] InfoName;
    private String[] InfoSName;
    private String[] InfoNumb;

    public TInfo(String[] InfoName, String[] InfoSName, String[] InfoNumb) {
        this.InfoName = InfoName;
        this.InfoSName = InfoSName;
        this.InfoNumb = InfoNumb;
    }

    public String[] getInfoName() {
        return InfoName;
    }
    public String[] getInfoSName() {
        return InfoSName;
    }
    public String[] getInfoNumb() {
        return InfoNumb;
    }

    public void setInfoName (String[] InfoName) {
        this.InfoName = InfoName;
    }
    public void setInfoSName (String[] InfoSName) {
        this.InfoSName = InfoSName;
    }
    public void setInfoNumb (String[] InfoNumb) {
        this.InfoNumb = InfoNumb;
    }

    @Override
    public String toString() {
        return "Информация о владельцах автомобилей " +
                "\nИмена: " + Arrays.toString(InfoName) +
                "\nФамилии: " + Arrays.toString(InfoSName) +
                "\nНомера телефонов: " + Arrays.toString(InfoNumb);
    }
}