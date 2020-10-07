package org.example.homework.hw02;

public class KvadratnoeU {
    public static void main(String[] args) {
        double a = 1;
        double b = -13;
        double c = 36;

        double d = (b * b) - (4 * a * c);
        System.out.println("Решение квадратного уравнения");

        System.out.print("Введите значение a -> ");

        System.out.print("Введите значение b -> ");

        System.out.print("Введите значение c -> ");

        System.out.println("a = " + a + " b = " + b + " c = " + c);


        System.out.println("Дискриминант = " + d);

        if (d < 0)
            System.out.print("Уравнение не имеет решений!!!");
        else if (d == 0) {
            double x1 = (-b) / (2 * a);
            System.out.println("x = " + x1);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            if (x1 == x2)
                System.out.println("x1 = x2 " + x1);
            else
                System.out.println("x1 =  " + x1 + "  x2 = " + x2);

        }
    }
}
//a x2+b x+c = 0