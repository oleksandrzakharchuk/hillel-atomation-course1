package org.example.codewars;

public class ExceptionCat {
    public static void main(String[] args) {
        int catNumber;
        int zero;
        catNumber = 1; // у меня один кот
        zero = 0; // ноль, он и в Африке ноль
        int result = catNumber / zero;
        System.out.println(result);
    }
}
//программа закрылась
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at org.example.homeworks.homework12Exeption.ExceptionCat1.main(ExceptionCat1.java:9)
//
//Process finished with exit code 1
