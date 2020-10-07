package org.example.homeworks.hw01;

public class CalculateNumber {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis()-546220800L +" "+"количество секунд между днем рождения"
                +"(1987-04-24T00: 00: 00 + 00: 00) и эпохой Unix.");

        double n = 1599265374179L;

        double day = n / (24 * 3600);

        n = n % (24 * 3600);
        double hour = n / 3600;

        n %= 3600;
        double minutes = n / 60;

        n %= 60;
        double seconds = n;

        System.out.println(day + " " + "days from birth\n"
                + hour  + " " + "hours from birth\n"
                + minutes + " " + "minutes from birth\n"
                + seconds + " " + "seconds from birth\n");
    }
}

// System.out.println(System.currentTimeMillis());//Текущая временная метка Unix

//Количество дней = ⌊ n / (24 * 3600) ⌋
//Количество часов = ⌊ (n% (24 * 3600)) / 3600 ⌋
//Количество минут = ⌊ (n% (24 * 3600 * 3600)) / 60 ⌋
