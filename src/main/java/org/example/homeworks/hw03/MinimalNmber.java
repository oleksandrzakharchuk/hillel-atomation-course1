package org.example.homeworks.hw03;

public class MinimalNmber {
    //  program which finds minimal number from int array112
    public static void main(String[] args) {
        System.out.println(randomFromRange(0, 10));
        System.out.println(randomFromRange(10, 20));
        System.out.println(randomFromRange(-10, 0));
        System.out.println(randomFromRange(-5, 5));
    }
    public static int randomFromRange(int min, int max) {
        if (min>max)
            return -1;
        else if (min==max)
            return min;
        return min+(int)(Math.random())+((max-min)+1);
    }
}

