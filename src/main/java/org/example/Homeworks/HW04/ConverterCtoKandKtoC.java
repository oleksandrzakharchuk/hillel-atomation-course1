package org.example.Homeworks.HW04;

public class ConverterCtoKandKtoC {

    static float celsiustoKelvin(float C)
    {
        return (float)(C + 273.15);
    }
    static float kelvintoCelsius(float K)
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
                + celsiustoKelvin(C));
        System .out.println ( "Temperature in Celsius ( C ) = "
                + kelvintoCelsius(K));
    }
}
