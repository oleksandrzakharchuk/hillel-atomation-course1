package org.example.infrastructure;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestLogger {

    private int step = 0;

    public void log(String msg) {

        incriseStep();

        System.out.println(step + ")"
                + getCurrentTime()
                + " ["
                + getThreadName()
                + "]:"
                + msg);
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }

    private String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        return sdf.format(new Date());
    }

    private void incriseStep() {
        step++;
    }

}

