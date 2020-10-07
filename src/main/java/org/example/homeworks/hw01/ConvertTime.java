package org.example.homeworks.hw01;

public class ConvertTime {
    public static void main(String[] args){

        System.out.println(System.currentTimeMillis() +" - " + "Текущая временная метка Unix");
        System.out.println(System.currentTimeMillis()/ (24L * 3600)+ " - " +"Количество дней");
        System.out.println(System.currentTimeMillis()% (24L * 3600)/ 3600 +" - "+"Количество часов");
        System.out.println(System.currentTimeMillis()% (24L * 3600 * 3600) / 60+" - " +"Количество минут");
        System.out.println(System.currentTimeMillis()% (24L * 3600 * 3600 * 60) / 60 +" - "+"Число секунд");
    }

}
//1. convert time in seconds to days, hours,
// min and seconds or reverse
//Количество дней = ⌊ n / (24 * 3600) ⌋
//Количество часов = ⌊ (n% (24 * 3600)) / 3600 ⌋
//Количество минут = ⌊ (n% (24 * 3600 * 3600)) / 60 ⌋
//Число секунд = ⌊ (n% (24 * 3600 * 3600 * 60)) / 60 ⌋
