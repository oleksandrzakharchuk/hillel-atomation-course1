package org.example.infrastructure.logger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestLogger extends TestLogger {

    private File file;

    public FileTestLogger(String logName) {
        file = new File(logName);
    }

    @Override
    public void log(String msg) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(file, true);
            fw.append(getCurrentTime() + "[" + getThreadName() + "]" + msg + "\n");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (fw != null) {
                try {
                    fw.flush();
                    fw.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

    //increaseStep() {

//    }
//
//    System.out.println(getStep()+")"getCurrentTime()+"["+getThreadName()+"]"+msg)
//    }

