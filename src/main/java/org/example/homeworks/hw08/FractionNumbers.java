package org.example.homeworks.hw08;

import java.util.Objects;

public class FractionNumbers {//Дробь
    private final int numerator;  //Числитель
    private final int denominator;  //Знаменатель


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumbers that = (FractionNumbers) o;
        return numerator == that.numerator &&
                denominator == that.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    public String toString() {
        return denominator + "/" + numerator;
    }

}

