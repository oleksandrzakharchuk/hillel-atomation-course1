package org.example.codewars.exeptionsCat;

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException extends Throwable {

    public static void main(String args[])  {
        try {

            // Following file does not exist
            File file;
            file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (java.io.FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File does not exist");
        }
    }
}
///Output: