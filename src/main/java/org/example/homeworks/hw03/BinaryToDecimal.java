package org.example.homeworks.hw03;

public class BinaryToDecimal {
    static int binaryToDecimal(int n)
    {
        int dec_value = 0;

        // Initializing base
        // value to 1, i.e 2^0
        int base = 1;

        int temp = n;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;

            dec_value += last_digit * base;

            base = base * 2;
        }

        return dec_value;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int num = 10011100;
        System.out.println(binaryToDecimal(num));
    }
}

