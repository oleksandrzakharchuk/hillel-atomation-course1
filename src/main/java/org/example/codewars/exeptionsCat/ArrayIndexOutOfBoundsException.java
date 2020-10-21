package org.example.codewars.exeptionsCat;
//Фрагмент кода может содержать несколько проблемных мест.
// Например, кроме деления на ноль, возможна ошибка индексации массива.
public class ArrayIndexOutOfBoundsException extends Throwable {

    public static void main(String[] args) {
        int catNumber;
        int zero;

        try { // мониторим код
            catNumber = 1; // у меня один кот
            zero = 4; // ноль, он и в Африке ноль
            int result = catNumber / zero;

            System.out.println("Увидите это сообщение если знаменатель >0");
//Теперь программа аварийно не закрывается,
// так как мы обрабатываем ситуацию с делением на ноль.
            //System.out.println("ArithmeticException );

            // Создадим массив из трёх котов
            String[] catNames = {"Васька", "Барсик", "Мурзик"};
            catNames[3] = "Рыжик";

        } catch (ArithmeticException e) {
            System.out.println("Нельзя котов делить на ноль!");

     } catch (Exception e) {
           System.out.println("ArrayIndexOutOfBoundsException");
//       //програма  не обрабатівает exeption ArrayIndexOutOfBoundsException если в блоке try
           /* catNumber = 1; // у меня один кот
            zero = 0; // ноль, он и в Африке ноль
            int result = catNumber / zero;*///- есть ошибка - zero = 0;
//       //java: exception org.example.codewars.exeptionsCat.ArrayIndexOutOfBoundsException
//            // is never thrown in body of corresponding try statement
//  }
        }
        System.out.println("Жизнь продолжается");
    }
}




