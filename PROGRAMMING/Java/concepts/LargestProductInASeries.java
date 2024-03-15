package concepts;

import java.util.Scanner;

public class LargestProductInASeries {

    //********************Method 1 using only for loop************************ */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the series and the series itself
        System.out.println("Enter the series of numbers:");
        String series = scanner.next(); // Input series as a string
        int N = series.length(); // Size of the series
        
        // Input the size of consecutive numbers to be chosen
        System.out.println("Enter the size of consecutive numbers:");
        int K = scanner.nextInt(); // Size of consecutive numbers to be chosen
        
        // Find the largest product of consecutive numbers
        long largestProduct = 0; // Using long to prevent integer overflow
        
        // Iterate through the series from index 0 to N - K
        // We stop iterating when the starting index of the last set of consecutive numbers (N - K) is reached
        // This ensures that we don't go out of bounds while extracting consecutive numbers of size K
        
        // Explanation for the loop:
        // - We start iterating from index 0 and continue until (N - K) to ensure that we don't go out of bounds
        // - We stop at (N - K) because starting from there, we can no longer form a complete set of K consecutive numbers
        // - For example, if N = 10 and K = 3, we stop at index 7, so the last set of consecutive numbers starts at index 7 and ends at index 9
        for (int i = 0; i <= N - K; i++) {
            // Initialize product for the current set of consecutive numbers
            long product = 1; // Using long to prevent integer overflow
            
            // Extract the next K consecutive numbers from the series
            
            // Explanation for the inner loop:
            // - We iterate K times to extract K consecutive numbers
            // - We use j as an offset to retrieve the character at (i + j) position
            // - i represents the starting index of the current set of consecutive numbers, and j represents the offset within that set
            //**** The term "offset" refers to the difference or distance between two positions within a sequence. In the context of the code, 
            //**** when I mentioned "offset", I meant the distance between the starting index of the current set of consecutive numbers (i) 
            //**** and the current position within that set (i + j).
            //****************** or alternative explanation if offset is not understandable:*************/
            // - We iterate K times to extract K consecutive numbers
            // - We use j as an index to retrieve the character at position (i + j) in the series string
            // - i represents the starting index of the current set of consecutive numbers, and j represents the index within that set
            for (int j = 0; j < K; j++) {
                // Retrieve the character at position (i + j) in the series string

                // Explanation:
                // - series.charAt(i + j) retrieves the character at position (i + j) in the series string
                // - i represents the starting index of the current set of consecutive numbers, and j represents the index within that set
                char ch = series.charAt(i + j);
                // Convert character to integer and calculate product
                int digit = Character.getNumericValue(ch); // Extract digit from series
                product *= digit; // Calculate product of consecutive digits
            }
            
            // Update the largestProduct if the current product is greater
            largestProduct = Math.max(largestProduct, product);
        }
        
        // Output the result
        System.out.println("Largest product of size " + K + " is: " + largestProduct);
        
        scanner.close();
    }
    //********************Method 2 using substring method************************ */

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     int N = scanner.nextInt();
    //     int K = scanner.nextInt();
    //     scanner.nextLine(); // Consume newline
    //     String series = scanner.nextLine();
    //     scanner.close();

    //     int maxProduct = 0;
    //     for (int i = 0; i <= series.length() - K; i++) {
    //         String currentNumber = series.substring(i, i + K);
    //         int product = 1;
    //         for (char c : currentNumber.toCharArray()) {
    //             product *= Character.getNumericValue(c);
    //         }
    //         maxProduct = Math.max(maxProduct, product);
    //     }

    //     System.out.println(maxProduct);
    // }
}