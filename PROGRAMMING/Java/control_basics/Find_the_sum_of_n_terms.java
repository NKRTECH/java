package control_basics;

import java.util.Scanner;

public class Find_the_sum_of_n_terms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number of terms

        long sum = 0;
        for (int i = 1; i < n+1; i++) {
            sum += i; // Add the current number to the sum
        }
        System.out.print(sum); // Print the sum
    }
}
