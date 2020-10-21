package org.example.codewars.exeptionsCat;

import org.example.infrastructure.wdm.DefaultWebDriverManager;
import org.example.infrastructure.wdm.WebDriverManager;

public class ExeptionApp1 {

    public static void main(String[] args) {
        /*int a=10/0;
        System.out.println(a);*/
        try{
            WebDriverManager wdm= new DefaultWebDriverManager();
            wdm.getBrowser();

        //catch (IllegalArgumentException ex) {
    }catch (Exception ex) {
            ex.printStackTrace();
        }finally {
            System.out.println("Finnaly blok");
           // System.out.println("Handling IllegalArgumentException");
            /*System.out.println("Handling Exception");
            System.out.println(ex.getCause());
            System.out.println(ex.getMessage());
            System.out.println(Arrays.toString(ex.getStackTrace()));*/
//System.exit (Integer.parseInt("255")); //явный выход
        }
        System.out.println("END");

    }
}
