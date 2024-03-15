package control_basics;

import java.util.Scanner;

public class Print_the_5th_multiple_of_given_number_n {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Read the number
        int multiple = n * 5; // Calculate the 5th multiple of n
        System.out.println("%d x 5 = %d".formatted(n, multiple)); // Print the result using formatted
        scanner.close(); // Close the scanner to avoid resource leaks
    }
}
