package org.example.homework.hw02;
import java.util.Random;
public class GreatestValue {
    public static void main(String[] args) {

        int nam1 = new Random().nextInt(100);
        System.out.println(nam1);
        int nam2 = new Random().nextInt(100);
        System.out.println(nam2);


        if(nam1>nam2)
            System.out.println("The num1  has the greatest value");
        else if (nam2>nam1)
            System.out.println("The num2  has the greatest value");
        else
            System.out.println("num1=num2");
    }
}
