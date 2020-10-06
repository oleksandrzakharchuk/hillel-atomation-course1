package org.example.Homeworks.HW04;

public class ComverterpoundsToKilogramsAndBack {
    static double poundsToKilomgrams(double P)
    {
        return P / 2.205;
    }
    static double kilomgramstoPoubds (double K)
    {
        return K * 2.205;
    }
    // Driver function
    public static void main (String[] args)
    {
        double P = 2;
        double K = 5;

        System .out.println ( "\n" +
                "weight in kilograms ( K ) = "
                + poundsToKilomgrams(P));
        System .out.println ( "\n" +
                "weight in pounds ( P ) = "
                + kilomgramstoPoubds(K));
    }
}
