package com.alokkr;

 public class Fuction {
    static void myMethod(){
        System.out.println(25);
    }
    public void yourMethod(){
        System.out.println("You are a noob player");
    }

    public static void main(String[] args) {
        Fuction ninja = new Fuction();

        myMethod();
        ninja.yourMethod();
    }
}
