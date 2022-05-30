import Vector.*;
import java.util.Scanner;
public class Program {
    public static void main(String[] s) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер вектора: ");
        int length = in.nextInt();
        VectorClass test = new VectorClass(length);
        System.out.println("Введите элементы вектора: ");
        for (int i = 0; i < test.getLenghth(); i++) {
            test.setElement(i, in.nextInt());
        }
        System.out.print("Элементы вектора: ");
        for (int i = 0; i < test.getLenghth(); i++) {
            System.out.print(test.getElement(i) + " ");
        }
        System.out.println("\nМинимальный элемент вектора: " + test.findMin());
        System.out.println("Максимальный элемент вектора: " + test.findMax());
        test.sortUp();
        System.out.print("Сортировка вектора по возрастанию: ");
        for (int i = 0; i < test.getLenghth(); i++) {
            System.out.print(test.getElement(i) + " ");
        }
        System.out.println("\nЕвклидова норма: " + test.findEuclid());
        System.out.println("Введите число для умножения на вектор ");
        int number = in.nextInt();
        System.out.print("Умножение вектора на число: ");
        test.numberMultiplier(number);
        for (int i = 0; i < test.getLenghth(); i++) {
            System.out.print(test.getElement(i) + " ");
        }
        VectorClass test2 = new VectorClass(length);
        System.out.println("\nВведите элементы второго вектора: ");
        for (int i = 0; i < test2.getLenghth(); i++) {
            test2.setElement(i, in.nextInt());
        }
        System.out.print("Сложение двух векторов: ");
        VectorClass sum = test.twoVectors(test2);
        for (int i = 0; i < test2.getLenghth(); i++) {
            System.out.print(sum.getElement(i) + " ");
        }
        System.out.print("\nСкалярное произведение : " + test.scalar(test2));
        in.close();
    }
}

