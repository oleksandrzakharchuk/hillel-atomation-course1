package org.example.infrastructure.utils;
import java.util.Random;

public class StringUtils{

    public enum StringMode{
        ALPHA, NUMERIC,ALPHANUMERIC
    }

    /*public static void main(String[] args) {
        System.out.println(randomString("alpha",10));
        System.out.println(randomString("alpha",5));
        System.out.println(randomString("alpha",25));
        System.out.println(randomString("numeric",10));
        System.out.println(randomString("numeric",5));
        System.out.println(randomString("numeric",25));
    }*/

    public static String randomString(StringMode mode,int length){
        //generator
        String alphabet;
        //alpha, numeric. alphanumeric
        switch (mode) {
            case ALPHA:
                alphabet = "abcdifghijklmnopqrstuvwxyz";
                break;
            case NUMERIC:
                alphabet = "0123456789";
                break;
            case ALPHANUMERIC:
                alphabet = "abcdifghijklmnopqrstuvwxyz0123456789";
                break;
            default:
                return "";
        }
        String randomStr="";
        for(int i=0; i<length; i++){
            randomStr+=alphabet.charAt(new Random().nextInt(alphabet.length()));
        }
        return randomStr;
    }

}
