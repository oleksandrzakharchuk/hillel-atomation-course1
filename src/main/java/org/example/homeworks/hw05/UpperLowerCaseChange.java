package org.example.homeworks.hw05;

public class UpperLowerCaseChange {
    public static void main(String[] args) {
        String str="qwertyuiop";
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        String str1= str.replace("q", "Q");
        System.out.println(str1);
        String str2=str.replace("qwertyuiop", "QWERTYUIOP");
        System.out.println(str2);

    }
}
