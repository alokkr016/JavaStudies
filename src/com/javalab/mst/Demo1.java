package com.javalab.mst;



import java.awt.*;
import javax.swing.*;

public class Demo1  {
    Frame f;
    Button buttons[];

    public Demo1 () {
        buttons = new Button [5];
        f = new Frame();
        for (int i = 0;i<5;i++) {
            buttons[i] = new Button ("Button " + (i + 10));
            f.add (buttons[i]);
        }

        f.setLayout (new BoxLayout (f, BoxLayout.X_AXIS));
        f.setSize(400,400);
        f.setVisible(true);
    }

    public static void main(String args[]){
        Demo1 b=new Demo1();
    }
}