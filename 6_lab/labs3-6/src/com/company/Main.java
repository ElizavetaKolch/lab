package com.company;
import java.io.*;
import java.util.Scanner;


public class Main {
    private static FactoryInterface factory;
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

        /*FlowInter[] flows = new FlowInter[]{
                new WorkWithBytes(),
                new WorkWithSymbols()
        };

        File fileR = new File("src/Files/TestR.txt");
        File fileW = new File("src/Files/TestW.txt");

        Information4();
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
            break;
        }*/
        /*ThreadArray array1 = new ThreadArray();
        ThreadingWrite write = new ThreadingWrite("Write", array1);
        ThreadingRead read = new ThreadingRead("Read", array1);
        write.start();
        read.start();

        try {
            write.join();
            read.join();
        }
        catch(InterruptedException e) {
            System.out.printf("Потоки %s и %s прерваны.", write.getName(), read.getName());
        }


        ThreadArray array2 = new ThreadArray();
        ThreadArraySynchronized synch = new ThreadArraySynchronized(array2);

        Thread threadWrite = new Thread(new ThreadingWriteRunnable(synch),"WriteRunnable");
        Thread threadReade = new Thread(new ThreadingReadRunnable(synch), "ReadRunnable");

        threadWrite.start();
        threadReade.start();

        try {

            threadWrite.join();
            threadReade.join();
        }
        catch(InterruptedException e) {
            System.out.printf("Потоки %s и %s прерваны.", threadWrite.getName(), threadReade.getName());
        }


        File file = new File ("src/Files/ThreadTest.txt");

        FlowInter[] flow = new FlowInter[]{

                new WorkWithSymbols()
        };

        ThreadFileSynchronized synchFile = new ThreadFileSynchronized(flow[0], file);
        Thread threadFileWrite = new Thread(new ThreadingFileWriteRunnable(synchFile),"WriteFileRunnable");
        Thread threadFileRead = new Thread(new ThreadingFileReadRunnable(synchFile),"ReadFileRunnable");

        threadFileWrite.start();
        threadFileRead.start();
        try {
            threadFileWrite.join();
            threadFileRead.join();
        }
        catch(InterruptedException e) {
            System.out.printf("Потоки %s и %s прерваны.", write.getName(), read.getName());
        }*/

        String[] TV = {
                "Первый", "Второй", "Третий"
        };

        String[] PC = {
                "First", "Second", "Third"
        };

        DNS[] iterators = new DNS[] {
                new TVBox(TV),
                new Computer(PC)
        };

        ///Создание и вызов неизменяемого объекта
        Unmodifiable unmod = new Unmodifiable(iterators[1]);
        unmod.setName("Drugster");

        ///Перебираем занчения объектов
        for(DNS object: iterators) {
            DNSIterator iter = object.iterator();
            while(iter.hasNext()) {
                System.out.println(iter.next());
            }
        }

        ///Создание интерфейса производства
        FactoryInterface[] fac = {
                new TVFactory(),
                new PCFactory()
        };

        DNS[] factors = new DNS[2];

        ///Производим объекты и вносим их в общий список объектов
        int count = 0;
        for(FactoryInterface object: fac) {
            setFactory(object);
            factors[count++]=createInstance();
        }
        count = 0;


        ///Присваиваем значениям новых объектов информацию о дате
        for(DNS object: factors) {
            object.setDay(20);
            object.setMonth(8);
            object.setYear(2022);
            System.out.println(object);
        }

    }

    public static void setFactory(FactoryInterface factory) {
        Main.factory = factory;
    }

    public static DNS createInstance() {
        return factory.createInstance();
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
    public static void Information4() {
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
    }
}
