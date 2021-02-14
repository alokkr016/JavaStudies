package com.alokkr;

import java.util.Scanner;

public class Egypt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of the row");
        int n = s.nextInt();

        for(int i = 1;i <= n;i++){
            for(int space = 1;space <= n-i;space++){
                System.out.print("  ");

            }
            int k = 0;

            while(k != 2*i - 1){
                System.out.print("* ");
                k++;
            }
            System.out.println("\n");
        }

    }
}
