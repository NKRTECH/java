package control_basics;

import java.util.*;

public class Display_a_matrix_of_mXn_size {

    //*****************method 1 using for loop and array******************************** */

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int m = in.nextInt();
    //     int n = in.nextInt();
    //     int[][] arr = new int[m][n];
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             arr[i][j] = in.nextInt();
    //         }
    //     }
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print(arr[i][j] + " ");
    //         }
    //         System.out.println();
    //     }
    //     in.close();
    // }

    //*****************method 2 using collections**************************************** */

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int m = in.nextInt();
    //     int n = in.nextInt();
    //     List<Integer> list = new ArrayList<>();
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             list.add(in.nextInt());
    //         }
    //     }
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             System.out.print(list.get(i * n + j) + " ");
    //         }
    //         System.out.println();
    //     }
    //     System.out.println(list);
    //     in.close();
    // }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int columns = in.nextInt();
        List matrix = new ArrayList<>();
        for(int i=0;i<rows;i++){
          List bar = new ArrayList<>();
          for(int j=0;j<columns;j++){
            // int num = in.nextInt();
            bar.add(1);
            System.out.print("%s ".formatted(bar.get(j)));
          }
          matrix.add(bar);
          System.out.println();
        }
        // System.out.print(matrix);
    }
}
