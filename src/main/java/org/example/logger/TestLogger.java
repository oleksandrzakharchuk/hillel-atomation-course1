package org.example.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class TestLogger {
    protected int step=1;

    public abstract void log(String msg);


    protected String getThreadName() {
        return Thread.currentThread().getName();
    }

    protected String getCurrentTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
        return sdf.format(new Date());

        /*protected int getStep () {
            step++;
            return step;*/
        }
    }



//    } void log(String msg) {
//        incriseStep();
//
//        System.out.println(step + ")"
//                + getCurrentTime()
//                + " ["
//                + getThreadName()
//                + "]:"
//                + msg);
//    }

//    private String getThreadName() {
//        return Thread.currentThread().getName();
//    }
//
//    private String getCurrentTime() {
//        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
//        return sdf.format(new Date());
//    }

//    private void incriseStep() {
//        step++;




