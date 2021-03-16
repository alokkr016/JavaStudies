package kumar.alok;

public class Fibonacci {


    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int fibo1 = 0, fibo2 = 1;
        System.out.print(fibo1 + " ");
        while (n > 1){
            int fibo;
            fibo = fibo1 + fibo2;
            System.out.print(" " + fibo);
            fibo2 = fibo1; fibo1 = fibo;
            n--;
        }

    }
}
