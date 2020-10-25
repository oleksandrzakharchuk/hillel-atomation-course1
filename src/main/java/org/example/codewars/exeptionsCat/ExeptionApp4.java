package org.example.codewars.exeptionsCat;

import org.example.infrastructure.data.FileUserDataMapper;
import org.example.infrastructure.data.UsersDataMapper;

import java.io.File;import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class ExeptionApp4 {
    public static void main(String[] args) throws Exception {

        /*FileWriter fw=null;

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
        System.out.println("Other logic");*/
        UsersDataMapper mapper=new FileUserDataMapper();
        System.out.println(Arrays.toString(mapper.getAll()));
//1,test1@gmail.com,123456
//2,test2@gmail.com,123456
//3,test2@gmail.com,123456
//4,test3@gmail.com,123456
//5,test5@gmail.com,123456
//6,test6@gmail.com,123456
//7,test7@gmail.com,123456
//8,test81@gmail.com,123456
//9,test9@gmail.com,123456
//10,test10@gmail.com,123456
//11,test11@gmail.com,123456
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