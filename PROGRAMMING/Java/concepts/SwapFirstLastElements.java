package concepts;

import java.util.Scanner;

public class SwapFirstLastElements {

    //**********my written code***********/
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine(); // Consume the newline character
        String str = in.nextLine();
        // System.out.print(str);
        String[] strarr = str.split(" ");
        String valueat0 = strarr[0];
        strarr[0] = strarr[strarr.length-1];
        strarr[strarr.length-1] = valueat0;
        // System.out.print(Arrays.toString(strarr));
        for(String c:strarr){
          System.out.print(c+" ");
        }
        // System.out.print(strarr);
    }
    
    //*****************AI generated code without using parseInt() method******************/
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int n = in.nextInt();
    //     in.nextLine(); // Consume the newline character

    //     // Directly read the array elements as integers
    //     int[] array = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         array[i] = in.nextInt();
    //     }

    //     // Swap the first and last elements of the array
    //     int temp = array[0];
    //     array[0] = array[n - 1];
    //     array[n - 1] = temp;

    //     // Print the modified array
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    // }

    //************AI generated code using parseInt() method******** */

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int n = in.nextInt();
    //     in.nextLine(); // Consume the newline character
    //     String[] inputArray = in.nextLine().split(" ");
    //     int[] array = new int[n];

    //     // Convert the array of strings into an array of integers
    //     // This is necessary because the input is read as a string, and we need to work with it as an integer
    //     for (int i = 0; i < n; i++) {
    //         // Integer.parseInt converts a string representation of a number into an actual integer value
    //         // This is a static method of the Integer class that takes a string as an argument and returns the integer value that the string represents
    //         array[i] = Integer.parseInt(inputArray[i]);
    //     }

    //     // Swap the first and last elements of the array
    //     int temp = array[0];
    //     array[0] = array[n - 1];
    //     array[n - 1] = temp;

    //     // Print the modified array
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(array[i] + " ");
    //     }
    // }
}
