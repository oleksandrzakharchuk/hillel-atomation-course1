package org.example.codewars.exeptionsCat;

public class StringIndexOutOfBound {
    public static void main(String args[])
    {
        try {
            String a = "This is like chipping"; // length is 22
            char c = a.charAt(21); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
}
