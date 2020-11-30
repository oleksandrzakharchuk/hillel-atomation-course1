package org.example.utils;
import java.util.Random;
import java.util.UUID;

public class StringUtils{

    public enum StringMode{
        ALPHA, NUMERIC,ALPHANUMERIC
    }

       public static String randomString(StringMode mode,int length){
        //generator
        String alphabet="";
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

        }
        String randomStr="";
        for(int i=0; i<length; i++){
            randomStr+=alphabet.charAt(new Random().nextInt(alphabet.length()));
        }
        return randomStr;
    }

    public static String randomUUID() {return UUID.randomUUID().toString();}

    public String randomAdminUser() {
        return randomString(StringMode.ALPHA,10)+".admon@mysite.com";

    }

    }

