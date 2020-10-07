package org.example.homeworks.hw03;

public class PrintsAllChars {
    //prints all chars for range of ints 0...127
    public static void main(String[] args) {

        for (int i = 0; i < 128; i++) {

            char c=(char)i;

            System.out.print(c+", ");

        }
    }
}
