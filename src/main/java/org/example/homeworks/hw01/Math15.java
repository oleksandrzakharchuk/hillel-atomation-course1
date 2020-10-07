package org.example.homeworks.hw01;
import static java.lang.Math.*;

public class Math15 {
    public static void main(String[] args) {

        double x = 15;
        double y = (abs(x * (log(x) - 4) * sqrt(x)) * (1 / pow((pow(E, 4 * x) - 1), 1. / 3)));

        System.out.println(y);
    }
}
