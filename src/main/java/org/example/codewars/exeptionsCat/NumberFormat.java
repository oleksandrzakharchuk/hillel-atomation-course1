package org.example.codewars.exeptionsCat;

public class NumberFormat {
    public static void main(String args[])
    {
        try {
            // "akki" is not a number
            int num = Integer.parseInt ("abba") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Number format exception");
        }
    }
}
