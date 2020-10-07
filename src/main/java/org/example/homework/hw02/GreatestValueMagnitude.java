package org.example.homework.hw02;

public class GreatestValueMagnitude {
    public static void main(String[] args) {

        int a = Math.abs(-9);
        int b=Math.abs(3);

        if (a > b && b!=a)
            System.out.println( true +"\n a>b," + a +">" + b );

        else
            System.out.println(false+"\n a < b");
    }
}

//Написать программу которая будет сравнивать
// величину (magnitude) двух чисел. Например,
// если одно число = 3, а второе число = -9,
// программа должна выдать,
// что число -9 имеет большую величину.

