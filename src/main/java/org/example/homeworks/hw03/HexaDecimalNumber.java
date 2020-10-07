package org.example.homeworks.hw03;

public class HexaDecimalNumber {
    static void decToHexa(int n)
    {
        // char array to store hexadecimal number
        char[] hexaDeciNum = new char[100];

        // counter for hexadecimal number array
        int i = 0;
        while(n!=0)
        {
            // temporary variable to store remainder
            int temp;

            // storing remainder in temp variable.
            temp = n % 16;

            // check if temp < 10
            if(temp < 10)
            {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else
            {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }

            n = n/16;
        }

        // printing hexadecimal number array in reverse order
        for(int j=i-1; j>=0; j--)
            System.out.print(hexaDeciNum[j]);
    }

    // driver program
    public static void main (String[] args)
    {
        int n = 2545;
        decToHexa(n);
    }
}

