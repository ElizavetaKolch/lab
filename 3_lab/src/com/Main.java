package com;
import com.company.*;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Interface[] objects = new Interface[] {
            new Cars(5, "Lada Vesta", 7),
            new Motorcycles(2, "Wels Impulse 250сс", 1),
            new Cars(3, "Mitsubishi Lancer", 10),
            new Motorcycles(1, "Kawasaki Z750", 8),
            new Cars(5, "Lada Vesta", 7)
        };

        getInfo(objects);
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
    }

    public static void getInfo(Interface[] obj) {
        for (int i = 0; i<obj.length; i++) {
            System.out.println();
            System.out.println(obj[i].toString());
            System.out.println("\n");
        }
    }

    public static void setInf(Interface[] obj) {
        Scanner sc = new Scanner(System.in);
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
        sc.close();
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
}
