package org.example.homeworks.hw12Exeptions;

import java.net.URL;

public class ExeptionApp3 {
    public static void main(String[] args) {

        try {
            //URL url=new URL("http://googl.com");
            URL url=new URL("googl.com");
        //} catch (MalformedURLException e) {
        //} catch (IOException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
