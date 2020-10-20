package org.example.homeworks.hw12Exeptions;

import java.io.File;
import java.io.FileWriter;


public class ExeptionApp4 {
    public static void main(String[] args) {

        try {
            //FileWriter fw=new FileWriter(new File("1.txt"), true);
            //FileWriter fw=new FileWriter(new File("1.txt"), true);
            FileWriter fw=new FileWriter(new File("/etc1/1.txt"), true);
            //Run-java.io.FileNotFoundException: \etc\1.txt (The system cannot find the path specified)
            fw.append("wertyuiop");

            fw.close();

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);//java.io.FileNotFoundException:
        }
    }
}

