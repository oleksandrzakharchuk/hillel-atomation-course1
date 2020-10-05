package org.example.Homeworks.HW04;

public class ComverterpoundsToKilogramsAndBack {
    static double PoundsToKilomgrams(double P)
    {
        return P / 2.205;
    }
    static double KilomgramstoPoubds (double K)
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
                + PoundsToKilomgrams(P));
        System .out.println ( "\n" +
                "weight in pounds ( P ) = "
                + KilomgramstoPoubds(K));
    }
}
