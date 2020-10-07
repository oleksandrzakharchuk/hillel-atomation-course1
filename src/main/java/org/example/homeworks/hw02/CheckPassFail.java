package org.example.homeworks.hw02;
import java.util.Random;
import java.util.Random;

public class CheckPassFail {
    public static void main(String[] args) {


        int mark=new Random().nextInt(100);
        System.out.println(mark);

        if (mark>=50) {
            System.out.println("PASS");
            System.out.println("DONE");
        }
        if (mark<=50){
            System.out.println("FAIL");
            System.out.println("DONE");
        }

    }

}
//1.
//Написать программу с названием “CheckPassFail”,
// которая выводит PASS если переменная “mark” типа int
// больше или равно 50 или вывести “FAIL” в противном случае.
//Программа всегда должна перед выходом печатать “DONE”
