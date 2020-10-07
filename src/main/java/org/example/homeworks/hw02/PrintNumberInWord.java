package org.example.homeworks.hw02;
import java.util.Random;
public class PrintNumberInWord {
    public static void main(String[] args) {

        int number = new Random().nextInt(6);
        System.out.println(number);

        switch (number) {
            case 1:
                System.out.println( "ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("\n" + "four");
                break;

            case 5:
                System.out.println("five");
                break;

        }
        if (number==1)
            System.out.println("\n"+"one");
        if (number==2)
            System.out.println("\n"+"two");
        if(number==3)
            System.out.println("\n"+"three");
        if (number==4)
            System.out.println("\n"+"four");
        if (number==5)
            System.out.println("\n" + "five");
    }
}

//Написать программу с названием “PrintNumberInWord”,
// которая напечатает “ONE”, “TWO”, …, “NINE”, “OTHER”
// если переменная “number” типа int будет 1, 2, 3, 4, … 9,
// или любой другой. Решить задачу двумя способами:
//1) с использованием if..else if
//2) с использованием switch-case

