package org.example.Homeworks.HW04;

public class ConverterNilesToKilometresAndBack {
    static double milesToKilometres(double M)
    {
        return M * 1.609;
    }
    static double kilometrestoMiles(double K)
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
                + milesToKilometres(M));
        System .out.println ( "Mileage ( M ) = "
                + kilometrestoMiles(K));
    }
}
