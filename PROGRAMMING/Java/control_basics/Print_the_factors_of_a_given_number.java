package control_basics;

import java.util.Scanner;

public class Print_the_factors_of_a_given_number {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Read the number
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // Check if i is a factor of n
                System.out.print("%d,".formatted(i)); // Print the factor
            }
        }
        in.close(); // Close the scanner to avoid resource leaks
    }
}
