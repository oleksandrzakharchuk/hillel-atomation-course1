package org.example.homeworks.hw04;

public class ConverterMetersToInchesAndBack {
    static float MetersToInches(float M)
    {
        return (float) (M * 39.37);
    }
    static float InchestoMeters(float I)
    {
        return (float)(I / 39.37);
    }
    // Driver function
    public static void main (String[] args)
    {
        // variable to hold the
        // temperature in Celsius and Kelvin
        float M = 5;
        float I = 20;

        System .out.println ( "Length in inches ( I ) = "
                + MetersToInches(M));
        System .out.println ( "Length in meters ( M ) = "
                + InchestoMeters(I));
    }
}

