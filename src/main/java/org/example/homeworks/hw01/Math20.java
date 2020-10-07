package org.example.homeworks.hw01;
import static java.lang.Math.*;
public class Math20 {
    public static void main(String[] args) {
        double x = 20;
        double y = pow(pow(log(x),2)+tan(cos(PI*x)),1./3)*(abs(log(x/10.5)+(0.3)));
        System.out.println(y);
    }
}
