package com;

import com.company.*;

import java.io.*;
import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Interface[] objects = new Interface[]{
                new Cars(5, "Lada Vesta", 7),
                new Motorcycles(2, "Wels Impulse 250сс", 1),
                new Cars(3, "Mitsubishi Lancer", 10),
                new Motorcycles(1, "Kawasaki Z750", 8),
                new Cars(5, "Lada Vesta", 7)
        };

        /*getInfo(objects);
        setInf(objects);

        System.out.println();
        getInfo(objects);

        equalsInf(objects);
        System.out.println();
        hashCodeInf(objects);

        System.out.println("-------------------------------------");
        Interface[] objects2 = newInterface(objects[2].getPlacesForOwners(),objects);
        getInfo(objects2);

        System.out.println("-------------------------------------");
        Interface[] objects3 = newClInterface(objects[1].getClass(), objects);
        getInfo(objects3);

        System.out.println("-------------------------------------");
        Interface[] objects4 = newClInterface(objects[0].getClass(), objects);
        getInfo(objects4);
        System.out.println("-------------------------------------");*/

        FlowInter[] flows = new FlowInter[]{
                new WorkWithBytes(),
                new WorkWithSymbols()
        };

        File fileR = new File("src/Files/TestR.txt");
        File fileW = new File("src/Files/TestW.txt");

        System.out.println("Выберите что нужно сделать с файлом: ");
        System.out.println("1) Записать значения в файл в байтовом формате" +
                "\n2) Записать значения в файл в символьном формате" +
                "\n3) Перезаписать данные в другой файл в байтовом формате" +
                "\n4) Перезаписать данные в другой файл в символьном формате" +
                "\n5) Вывести информацию в байтовом формате" +
                "\n6) Вывести информацию в символьном формате" +
                "\n7) Вывести информацию из второго файла в байтовом формате" +
                "\n8) Вывести информацию из второго файла в символьном формате" +
                "\n9) Создать сериализуемый файл" +
                "\n10) Вывести десириализуемый файл");
        while (true) {
            switch (sc.nextInt()) {
                case 1:
                    setFlowOutput(flows[0], fileW, "Это проверочная строка, всё хорошо.");
                    break;
                case 2:
                    setFlowOutput(flows[1], fileW, "Это проверочная строка, всё хорошо.");
                    break;
                case 3:
                    setFlowOutput(flows[0], fileR, getFlowInput(flows[0], fileW));
                    break;
                case 4:
                    setFlowOutput(flows[1], fileR, getFlowInput(flows[1], fileW));
                    break;
                case 5:
                    getFlowInfo(flows[0], fileW);
                    break;
                case 6:
                    getFlowInfo(flows[1], fileW);
                    break;
                case 7:
                    getFlowInfo(flows[0], fileR);
                    break;
                case 8:
                    getFlowInfo(flows[1], fileR);
                    break;
                case 9:
                    SerializeCreateFile();
                    break;
                case 10:
                    SerializeOutputFile();
                    break;
            }
        }
    }

    public static void getInfo(Interface[] obj) {
        for (int i = 0; i<obj.length; i++) {
            System.out.println();
            System.out.println(obj[i].toString());
            System.out.println("\n");
        }
    }

    public static void setInf(Interface[] obj) {

        for (int i = 0; i<obj.length; i++) {
            if (i==0) {
                System.out.println("Введите максимальное количество cобственников для автомобиля <<"+ obj[i].getModel() +">>: " );
                    int j = 0;
                    System.out.print("Собственников: ");
                    obj[i].setOwners(j, sc.nextInt());
                    System.out.println();
            }
            if (i==1) {
                System.out.println("Введите максимальное количество cобственников для мотоцикла <<"+ obj[i].getModel() +">> : " );
                int j = 0;
                System.out.print("Собственников: ");
                obj[i].setOwners(j, sc.nextInt());
                System.out.println();
            }
            if(i>1) {
                System.out.println("Введите максимальное количество cобственников для машины <<"+ obj[i].getModel() +">> : " );
                int j = 0;
                System.out.print("Собственников: ");
                obj[i].setOwners(j, sc.nextInt());
                System.out.println();
            }
        }

    }

    public static void equalsInf(Interface[] obj) {
        for (int i = 0; i<obj.length; i++) {
            for(int j = 0; j<obj.length; j++) {
                if(obj[i].equals(obj[j]) == true) {
                    System.out.println("Классы или имена этих объектов совпадают. ");
                }
                else {
                    System.out.println("Ни классы, ни имена этих объектов не совпадают. ");
                }
            }
            System.out.println();
        }
    }

    public static void hashCodeInf(Interface[] obj) {
        for (int i = 0; i<obj.length; i++) {
            System.out.println(obj[i].hashCode());
        }
    }

    public static Interface[] newInterface(int value, Interface[] objects) {
        Interface[] test;
        int count = 0;
        for (int i = 0; i<objects.length; i++) {
            if(objects[i].getPlacesForOwners()==value) {
                count++;
            }
        }
        if(count>0) {
            test = new Interface[count];
            count = 0;
            for (int i = 0; i<objects.length; i++) {
                if(objects[i].getPlacesForOwners()==value) {
                    test[count]=objects[i];
                    count++;
                }
            }
            return test;
        }
        return null;
    }
    public static Interface[] newClInterface(Object value, Interface[] objects) {
        Interface[] test;
        int count = 0;
        for (int i = 0; i<objects.length; i++) {
            if(objects[i].getClass()==value) {
                count++;
            }
        }
        if(count>0) {
            test = new Interface[count];
            count = 0;
            for (int i = 0; i<objects.length; i++) {
                if(objects[i].getClass()==value) {
                    test[count]=objects[i];
                    count++;
                }
            }
            return test;
        }
        return null;
    }
    public static void getFlowInfo(FlowInter inter, File file) throws IOException {
        try {
            System.out.println(inter.flowInput(file));
        }
        catch(IOException e){
            System.err.println("Ошибка: " + e);
        }
    }
    public static String getFlowInput(FlowInter inter, File file) throws IOException {
        try{
            return inter.flowInput(file);
        }
        catch (IOException e) {
            System.err.println("Ошибка: " + e);
        }
        return null;
    }
    public static void setFlowOutput(FlowInter inter, File file, String args) throws IOException {
        try {
            inter.flowOpen(file);
            inter.flowOutput(args);
            inter.flowClose();
        }
        catch (IOException e) {
            System.err.println("Ошибка: " + e);
        }
    }
    public static void SerializeCreateFile() throws IOException {
        String [] Names = {"Иван", "Алексей", "Николай"};
        String [] SNames = {"Грозный", "Пешков", "Синицин"};
        String [] Numbs = {"8 (960)-828-00-73", "8 (937)-180-18-18", "8 (937)-077-73-43"};

        TInfo TelephoneBook = new TInfo(Names, SNames, Numbs);
        FileOutputStream TelBook = new FileOutputStream("src/Files/TelephoneBook.txt");
        ObjectOutputStream ObjTelBook = new ObjectOutputStream(TelBook);

        ObjTelBook.writeObject(TelephoneBook);
        ObjTelBook.close();
    }
    public static void SerializeOutputFile() throws IOException, ClassNotFoundException {
        FileInputStream TelBook = new FileInputStream("src/Files/TelephoneBook.txt");
        ObjectInputStream ObjTelBook = new ObjectInputStream(TelBook);
        TInfo TelephoneBook = (TInfo) ObjTelBook.readObject();
        ObjTelBook.close();
        System.out.println(TelephoneBook);
    }
}

