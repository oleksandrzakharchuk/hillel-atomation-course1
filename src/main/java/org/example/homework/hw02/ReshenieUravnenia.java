package org.example.homework.hw02;
import java.util.Random;
public class ReshenieUravnenia {
    public static void main(String[] args) {

        /*Задача ax + b = 0;
         Решение:
         Преобразуем выражение:
         ax + b = 0;
         ax =  - b;
         x = (- b) / a;
         Посчитаем*/
        double b = -9.88;
        double a = -6.77;

        double x=(-b)/a;

        System.out.println(x);

        System.out.print("Значение \"a\" и \"b\" не могут быть равными 0!");

    }
}
