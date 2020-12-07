package org.example.utils;

public class TimeUtils {
    public static void waitFor(int seconds){
        try{
        Thread.sleep(seconds*1000);
        }catch (Exception ex){
        ex.printStackTrace();

        }

    }
}
