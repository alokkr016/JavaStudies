package com.java.assignment;

public class SalesPersonDaysThreadTask2 {
    public static void main(String[] args) {
        SalesPerson person = new SalesPerson();
        Thread t = new Thread(new Days(person));
        t.start();

    }
}