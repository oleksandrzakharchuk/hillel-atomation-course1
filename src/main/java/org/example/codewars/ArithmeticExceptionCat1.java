package org.example.codewars;

public class ArithmeticExceptionCat1 {

    public static void main(String[] args) {
        int catNumber;
        int zero;

        try { // мониторим код
            catNumber = 1; // у меня один кот
            zero = 0; // ноль, он и в Африке ноль
            int result = catNumber / zero;
            System.out.println("Увидите это сообщение если знаменатель >0");
//Теперь программа аварийно не закрывается,
// так как мы обрабатываем ситуацию с делением на ноль.

        } catch (ArithmeticException e) {
            System.out.println("Нельзя котов делить на ноль!");

        }
           System.out.println("Жизнь продолжается");
    }


    }

