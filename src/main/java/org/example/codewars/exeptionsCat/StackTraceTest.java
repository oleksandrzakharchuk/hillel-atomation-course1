package org.example.codewars.exeptionsCat;

import java.util.Scanner;

public class StackTraceTest {

    public static int factorial(int n)
    {


        System.out.println("factorial(" + n + "):");
        var walker = StackWalker.getInstance();
        walker.forEach(System.out::println);
        int r;
        if (n <= 1) r = 1;
        else r = n * factorial(n - 1);
        System.out.println("return " + r);
        return r;
    }

    public static void main(String[] args) {
        try (var in = new Scanner(System.in)) {
            System.out.print("Enter n: ");
            int n = in.nextInt();
            factorial(n);
        }
    }
}
/*Enter n: 3
factorial(3):
org.example.codewars.exeptionsCat.StackTraceTest.factorial(StackTraceTest.java:13)
org.example.codewars.exeptionsCat.StackTraceTest.main(StackTraceTest.java:25)
factorial(2):
org.example.codewars.exeptionsCat.StackTraceTest.factorial(StackTraceTest.java:13)
org.example.codewars.exeptionsCat.StackTraceTest.factorial(StackTraceTest.java:16)
org.example.codewars.exeptionsCat.StackTraceTest.main(StackTraceTest.java:25)
factorial(1):
org.example.codewars.exeptionsCat.StackTraceTest.factorial(StackTraceTest.java:13)
org.example.codewars.exeptionsCat.StackTraceTest.factorial(StackTraceTest.java:16)
org.example.codewars.exeptionsCat.StackTraceTest.factorial(StackTraceTest.java:16)
org.example.codewars.exeptionsCat.StackTraceTest.main(StackTraceTest.java:25)
return 1
return 2
return 6

Process finished with exit code 0
*/