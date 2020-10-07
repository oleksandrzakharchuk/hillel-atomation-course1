package org.example.homeworks.hw04;

public class ConverterNilesToKilometresAndBack {
    static double MilesToKilometres(double M)
    {
        return M * 1.609;
    }
    static double KilometrestoMiles(double K)
    {
        return K / 1.609;
    }
    // Driver function
    public static void main (String[] args)
    {
        double M = 200;
        double K = 50;

        System .out.println ( "\n" +
                "Distance in kilometers ( K ) = "
                + MilesToKilometres(M));
        System .out.println ( "Mileage ( M ) = "
                + KilometrestoMiles(K));
    }
}

