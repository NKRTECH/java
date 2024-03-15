package control_basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_the_elements_of_array {

    //**********************method 1 using array*************************************** */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Read the number of elements

        int[] array = new int[N]; // Create an array of size N

        // Read N elements from the user and store them in the array
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Print the elements of the array separated by commas
        for (int i = 0; i < N; i++) {
            System.out.print(array[i]);
            if (i < N - 1) {
                System.out.print(",");
            }
        }
        System.out.println(","); // Print a trailing comma

        // for (int i = 0; i < N; i++) {
        //     if (i == N - 1) {
        //         System.out.print("%d".formatted(array[i]));
                
        //     }
        //     else{
        //         System.out.print("%d, ".formatted(array[i]));
        //     }
        // }

        scanner.close(); // Close the scanner to avoid resource leaks
    }

    //**********************method 2 using StringBuilder*********************** */

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     int N = scanner.nextInt(); // Read the number of elements

    //     int[] array = new int[N]; // Create an array of size N

    //     // Read N elements from the user and store them in the array
    //     for (int i = 0; i < N; i++) {
    //         array[i] = scanner.nextInt();
    //     }

    //     // Use a simple loop to construct the output string
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < N; i++) {
    //         sb.append(array[i]);
    //         if (i < N - 1) {
    //             sb.append(",");
    //         }
    //     }
    //     sb.append(","); // Append a trailing comma

    //     // Print the constructed string
    //     System.out.println(sb);

    //     scanner.close(); // Close the scanner to avoid resource leaks
    // }

    //**************************************method 3 using ArrayList********************************* */

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     int N = scanner.nextInt(); // Read the number of elements

    //     List<Integer> list = new ArrayList<>(); // Create an ArrayList

    //     // Read N elements from the user and add them to the list
    //     for (int i = 0; i < N; i++) {
    //         list.add(scanner.nextInt());
    //     }

    //     // Manually construct the output string using a loop
    //     String output = "";
    //     for (int i = 0; i < N; i++) {
    //         output += list.get(i);
    //         if (i < N - 1) {
    //             output += ",";
    //         }
    //     }
    //     output += ","; // Append a trailing comma

    //     // Print the constructed string
    //     System.out.println(output);

    //     scanner.close(); // Close the scanner to avoid resource leaks
    // }
}
