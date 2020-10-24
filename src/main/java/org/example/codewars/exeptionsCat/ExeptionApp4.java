package org.example.codewars.exeptionsCat;

import java.io.File;import java.io.FileWriter;
import java.io.IOException;


public class ExeptionApp4 {
    public static void main(String[] args) {

        FileWriter fw=null;

        try {
            //FileWriter fw=new FileWriter(new File("1.txt"), true);
            //FileWriter fw=new FileWriter(new File("1.txt"), true);
            fw=new FileWriter(new File("/etc1/1.txt"), true);
            //Run-java.io.FileNotFoundException: \etc\1.txt (The system cannot find the path specified)
            fw.append("wertyuiop");

           // fw.close();

        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e);//java.io.FileNotFoundException:
        }finally {
            closeFile(fw);
        }
    //...

//...
        System.out.println("Other logic");
}

    public static void appendLineFile(String file, String line)  throws Exception //throws Exception
    {
FileWriter fw =new FileWriter(new File(file), true);
fw.write(line);
fw.flush();
fw.close();
    }
    public static void closeFile(FileWriter fw) {
try {
    fw.close();
    }catch (IOException e){
    e.printStackTrace();
    }finally {
    System.out.println();
    }
    }
    }
/*java.io.FileNotFoundException: \etc1\1.txt (The system cannot find the path specified)
Exception in thread "main" java.lang.NullPointerException
	at org.example.codewars.exeptionsCat.ExeptionApp4.closeFile(ExeptionApp4.java:35)
	at org.example.codewars.exeptionsCat.ExeptionApp4.main(ExeptionApp4.java:25)
*/
//http://googl.com