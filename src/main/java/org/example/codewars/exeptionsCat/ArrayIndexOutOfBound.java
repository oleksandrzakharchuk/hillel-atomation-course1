package org.example.codewars.exeptionsCat;

public class ArrayIndexOutOfBound {
    public static void main(String args[])
    {
        try{
            int a[] = new int[5];
            a[6] = 9; // accessing 7th element in an array of
            // size 5
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println ("Array Index is Out Of Bounds");
        }
    }
}
