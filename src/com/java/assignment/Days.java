package com.java.assignment;

class Days implements Runnable {
    private String[] days = { "Sunday", "Monday", "Tuesday", "Wednessday", "Thursday", "Friday", "Saturday" };
    private static boolean stopFlag = false;
    SalesPerson salesPerson;

    public Days(SalesPerson salesPerson) {
        super();
        this.salesPerson = salesPerson;
        Thread t = new Thread(this);
        t.start();
        salesPerson.suspend();
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                while (!stopFlag) {
                    for (String day : days) {
                        System.out.println(day);
                        if (day.equals("Sunday") || day.equals("Monday") || day.equals("Tuesday")) {
                            salesPerson.suspend();
                        } else if (day.equals("Wednessday")) {
                            salesPerson.resume();
                            Thread.sleep(2500);
                        } else {
                            Thread.sleep(2500);
                        }
                    }
                    salesPerson.suspend();
                    stopFlag = true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}