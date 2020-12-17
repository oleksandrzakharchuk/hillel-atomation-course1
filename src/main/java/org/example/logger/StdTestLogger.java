package org.example.logger;

public class StdTestLogger extends TestLogger {

    public void log(String msg) {


        System.out.println(step+")"+getCurrentTime()+"["+getThreadName()+"]"+msg);
        step++;
    }
}
