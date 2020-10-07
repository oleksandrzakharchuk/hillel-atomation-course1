package org.example.homeworks.hw02;

import java.util.Random;

public class CheckOddEven {
    public static void main(String[] args) {

        int number = new Random().nextInt(100);
        System.out.println(number);

        if ( number% 2 == 0) {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");}

        System.out.println("BYE");
    }
}
//Написать программу с названием “CheckOddEven”,
// которая печатает “Odd Number” если переменная “number”
// типа int нечетная. Или “Even Number” если переменная четная.
// Программа всегда должна перед выходом печатать “BYE”

