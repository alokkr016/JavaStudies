package com.alokkr.javalab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLetter{
    public static void main(String[] args) {
        Path file = Paths.get("E:\\input.txt");
        CountLetter cl1 = new CountLetter(file, 'r');
        System.out.println(cl1.count());
        System.out.println("Manas khare 19bcs1675");
    }

    private Path file;
    private char lookFor;

    CountLetter(Path file, char lookFor){
        this.file = file;
        this.lookFor = lookFor;
    }

    private int count(){
        int count = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(Files.newInputStream(file)))){
            String line = null;
            while((line = br.readLine()) != null){
                for(int i = 0; i < line.length(); i++){
                    if(line.charAt(i) == lookFor){
                        count++;
                    }
                }
            }
        } catch (IOException x){
            System.err.println(x);
        }
        return count;
    }
}