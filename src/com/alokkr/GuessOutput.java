package com.alokkr;
import java.io.*;

public class GuessOutput {

    public static void main(String[] args) throws IOException {

        FileWriter fw = new FileWriter("file.txt");

        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("Hello, This is Merit Campus.");

        bw.close();

        FileReader fr = new FileReader("file.txt");

        BufferedReader br = new BufferedReader(fr);

        br.read();

        br.skip(6);

        br.reset();

        System.out.println((char)br.read());

        br.close();

    }

}