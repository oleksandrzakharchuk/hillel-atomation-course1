package org.example.homeworks.hw08;

public class FractionNumbersApp {
    public static void main(String[] args) {
        FractionNumbers frac1 = new FractionNumbers(2, 1);
        FractionNumbers frac2 = new FractionNumbers(19, 15);

        System.out.println(frac1.equals(frac2));

        System.out.println(frac1.hashCode());
        System.out.println(frac2.hashCode());


        FractionNumbers plus = frac2.plus(frac1);
        FractionNumbers minus = frac1.minus(frac2);
        FractionNumbers multiply = frac2.multiply(frac1);
        FractionNumbers divide = frac1.divide(frac2);

        System.out.println("frac1=" + frac1);
        System.out.println("frac2=" + frac2);


        System.out.println("frac2+frac1=" + plus);
        System.out.println("frac1-frac2=" + minus);
        System.out.println("frac2*frac1=" + multiply);
        System.out.println("frac1/frac2=" + divide);

    }
}

