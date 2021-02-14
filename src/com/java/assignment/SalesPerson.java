package com.java.assignment;

import java.util.Random;

class SalesPerson implements Runnable {
    private String[] salesPersonName = { "sp1", "sp2", "sp3", "sp4", "sp5", "sp6", "sp7", "sp8" };
    private static boolean stopFlag = true;
    Thread th;

    public SalesPerson() {
        super();
        th = new Thread(this);
        th.start();
    }

    @Override
    public void run() {
        while (stopFlag) {
            try {
                int index = new Random().nextInt(7);
                System.out.println(salesPersonName[index]);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isStopFlag() {
        return stopFlag;
    }

    public void setStopFlag(boolean stopFlag) {
        SalesPerson.stopFlag = stopFlag;
    }

    public void suspend() {
        setStopFlag(false);
    }

    public void resume() {
        setStopFlag(true);
    }

}
