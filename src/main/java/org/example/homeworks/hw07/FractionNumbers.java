package org.example.homeworks.hw07;

public class FractionNumbers {//Дробь
    private int numerator;  //Числитель
    private int denominator;  //Знаменатель


    public FractionNumbers(int denominator, int numerator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public FractionNumbers plus(FractionNumbers other) {
        int newNominator = getNumerator() * other.getDenominator()
                + getDenominator() * other.getNumerator();

        int newDenominator = getDenominator() * other.getDenominator();

        return new FractionNumbers(newNominator, newDenominator);
    }

    public FractionNumbers minus(FractionNumbers other) {
        int newNominator = getNumerator() * other.getDenominator()
                - getDenominator() * other.getNumerator();

        int newDenominator = getDenominator() * other.getDenominator();

        return new FractionNumbers(newNominator, newDenominator);
    }

    public FractionNumbers multiply(FractionNumbers other) {
        int newNominator = getNumerator() * other.getNumerator();
        int newDenominator = getDenominator() * other.getDenominator();

        return new FractionNumbers(newNominator, newDenominator);
    }

    public FractionNumbers divide(FractionNumbers other) {
        int newNominator = getNumerator() * other.getDenominator();
        int newDenominator = getDenominator() * other.getNumerator();

        return new FractionNumbers(newNominator, newDenominator);
    }

    public String toString() {
        return denominator + "/" + numerator;
    }

}

