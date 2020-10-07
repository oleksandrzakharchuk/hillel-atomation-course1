package org.example.homeworks.hw03;

public class MinimumValue {
    public static void main(String[] args) {

//find the minimum value in an array


        int[] ints = {0,2,4,6,8,10};

        int minVal = Integer.MAX_VALUE;

        for (int anInt : ints) {
            if (anInt < minVal) {
                minVal = anInt;
            }
        }

        System.out.println("minVal = " + minVal);



        int maxVal = Integer.MIN_VALUE;
        for (int anInt : ints) {
            if (anInt > maxVal) {
                maxVal = anInt;
            }
        }
        System.out.println("maxVal = " + maxVal);
    }
}
