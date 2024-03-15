package concepts.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Set_Matrix_Zeroes {
    //*******************method 1 beginner friendly************************ */
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
        
    //     // Taking the row and column Input
    //     int n = scanner.nextInt();
    //     int m = scanner.nextInt();
        
    //     // Initializing the matrix array
    //     int[][] matrix = new int[n][m];
        
    //     // Taking the array elements input
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             matrix[i][j] = scanner.nextInt();
    //         }
    //     }
        
    //     // Iterating over the matrix to set entire rows and columns to -1 if any element is 0
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (matrix[i][j] == 0) {
    //                 // Set entire column elements to -1
    //                 for (int k = 0; k < n; k++) {
    //                     if (matrix[k][j] != 0) {
    //                         matrix[k][j] = -1;
    //                     }
    //                 }
    //                 // Set entire row elements to -1
    //                 for (int k = 0; k < m; k++) {
    //                     if (matrix[i][k] != 0) {
    //                         matrix[i][k] = -1;
    //                     }
    //                 }
    //             }
    //         }
    //     }
        
    //     // Now change the value to zero where -1 is present
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             if (matrix[i][j] == -1) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
        
    //     // Printing the resultant matrix
    //     System.out.println("Matrix after setting zeroes:");
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j < m; j++) {
    //             System.out.print(matrix[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
        
    //     scanner.close();
    // }

    //********************method 2 using hashset**********/
     public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of rows and columns
        System.out.println("Enter the number of rows and columns:");
        // Read the number of rows
        int rows = scanner.nextInt();
        // Read the number of columns
        int cols = scanner.nextInt();
        // Consume the newline character after reading the numbers
        scanner.nextLine();

        // Initialize a 2D array (matrix) with the specified number of rows and columns
        int[][] matrix = new int[rows][cols];

        // Prompt the user to enter the matrix elements
        System.out.println("Enter the matrix elements:");
        // Loop through each row
        for (int i = 0; i < rows; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < cols; j++) {
                // Read the matrix element at position (i, j)
                matrix[i][j] = scanner.nextInt();
            }
        }
        // Close the scanner to avoid resource leaks
        scanner.close();
        System.out.println(Arrays.deepToString(matrix));

        // Initialize a HashSet to keep track of rows that should be set to zero
        Set<Integer> rowsToZero = new HashSet<>();
        // Initialize a HashSet to keep track of columns that should be set to zero
        Set<Integer> colsToZero = new HashSet<>();

        // First pass through the matrix to mark rows and columns that should be set to zero
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the current matrix element is zero, add its row and column indices to the respective HashSets
                if (matrix[i][j] == 0) {
                    rowsToZero.add(i);
                    colsToZero.add(j);
                }
            }
        }

        // Second pass through the matrix to set rows and columns to zero based on the HashSets
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // If the current row or column is marked in the HashSets, set the matrix element to zero
                if (rowsToZero.contains(i) || colsToZero.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Print the modified matrix
        for (int[] row : matrix) {
            for (int num : row) {
                // Print each element of the matrix, followed by a space
                System.out.print(num + " ");
            }
            // Print a newline character after each row
            System.out.println();
        }
    }
    
}
