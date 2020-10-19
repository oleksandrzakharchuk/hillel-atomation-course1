package org.example.infrastructure.logger;

import java.io.File;
import java.io.FileWriter;

public class FileTestLogger extends TestLogger {

    private File file;
    public FileTestLogger() {
        file=new File("report"+System.currentTimeMillis()+"log");
    }

    @Override
    public void log(String msg) {

           try {

        FileWriter fw = new FileWriter(file, true);
        fw.append( getCurrentTime() + "[" + getThreadName() + "]" + msg+"\n");


        fw.flush();
        fw.close();
    }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}

    //increaseStep() {

//    }
//
//    System.out.println(getStep()+")"getCurrentTime()+"["+getThreadName()+"]"+msg)
//    }

