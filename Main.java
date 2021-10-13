package cs.vsu.ru.lyashenko_e_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        int a = Enter();
        int b = Enter();
        int c = Enter();

        if (a>b) {          // Сортировка для вариантов A и Б
            int third = b;
            b = a;
            a = third;
        }
        if (b>c) {          // Сортировка для вариантов Б и C
            int third1 = b;
            b = c;
            c = third1;
        }
        if (a>b) {         
            int third2 = b;
            b = a;
            a = third2;
        }
        double d = FindingD(a, b, c); 
        double q = FindingQ(a, b, c);
    }

    public static int Enter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        return x;
    }

    public static double FindingD(double q, double w, double e){ // Находим шаг ариф.прогрессии(D)
        if ((w - q) == (e - w)){
            double d = w - q;
            System.out.println("Являются членами арифметической прогрессии с шагом " + d);

        }
        else {
            System.out.println("Не являются членами арифметической прогрессии");
        }
        return 0;
    }

    public static double FindingQ (double q1, double w1, double e1){ // Находим шаг геом.прогрессии(Q)
        if ((w1 / q1) == (e1 / w1)){
            double q = w1 / q1;
            System.out.println("Являются членами геометрической прогрессии с шагом " + q);

        }
        else {
            System.out.println("Не являются членами геометрической прогрессии");
        }
        return 0;
    }
}
