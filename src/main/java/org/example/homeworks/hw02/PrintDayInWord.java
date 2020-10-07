package org.example.homeworks.hw02;
import java.util.Random;
public class PrintDayInWord {
    public static void main(String[] args) {

        int day = new Random().nextInt(8);
        System.out.println(day);

        switch (day) {
            case 1:
                System.out.println( "Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not a valid day");
        }
        if (day==1)
            System.out.println("Sunday");
        else if (day==2)
            System.out.println("Monday");
        else if(day==3)
            System.out.println("Tuesday");
        else if (day==4)
            System.out.println("Wednesday");
        else if (day==5)
            System.out.println("Thursday");
        else if (day==6)
            System.out.println("Friday");
        else if (day==7)
            System.out.println("Saturday");
        else
            System.out.println("Not a valid day");

    }
}

//Написать программу с названием “PrintNumberInWord”,
// которая напечатает “ONE”, “TWO”, …, “NINE”, “OTHER”
// если переменная “number” типа int будет 1, 2, 3, 4, … 9,
// или любой другой. Решить задачу двумя способами:
//1) с использованием if..else if
//2) с использованием switch-case
