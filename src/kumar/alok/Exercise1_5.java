/*Complete the code segment to help Raj ,
find the highest mark and average mark secured by him in "s" number of subjects.*/
package kumar.alok;

import java.util.Scanner;
public class Exercise1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;

        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];

        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int max = 0;
        int result = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
            result = result + arr[j];
        }

        mark_avg = result / s;
        System.out.println(max);
        System.out.print(mark_avg);
    }
}



