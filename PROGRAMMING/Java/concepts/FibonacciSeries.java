package concepts;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        int first = 0;
        int second = 1;
        if(n==0){
            System.out.print(0);
        }else{
        // Print the first two Fibonacci numbers
        System.out.print(first + " ");
        System.out.print(second + " ");
        // Calculate and print the next Fibonacci numbers up to the nth term
        for (int i = 2; i <= n; i++) {
            // Calculate the next Fibonacci number as the sum of the previous two numbers
            int next = first + second;
            // Print the next Fibonacci number
            System.out.print(next + " ");
            // Update the first and second numbers for the next iteration
            first = second;
            second = next;
        }

        }
    }
}