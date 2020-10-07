package org.example.homeworks.hw04;

public class ConverterCtoKandKtoC {

    static float CelsiustoKelvin(float C)
    {
        return (float)(C + 273.15);
    }
    static float KelvintoCelsius(float K)
    {
        return (float)(K - 273.15);
    }
    // Driver function
    public static void main (String[] args)
    {
        // variable to hold the
        // temperature in Celsius and Kelvin
        float C = 27;
        float K = 200;


        System .out.println ( "Temperature in Kelvin ( K ) = "
                + CelsiustoKelvin(C));
        System .out.println ( "Temperature in Celsius ( C ) = "
                + KelvintoCelsius(K));
    }
}

