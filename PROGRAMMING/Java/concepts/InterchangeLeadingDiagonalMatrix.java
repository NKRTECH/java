package concepts;

import java.util.*;

public class InterchangeLeadingDiagonalMatrix {
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int size = in.nextInt();
    //     List<List<Integer>> matrix = new ArrayList<>(); // Corrected type to List<List<Integer>>
    //     List<Integer> list = new ArrayList<>();

    //     for (int i = 0; i < size; i++) {
    //         for(int j = 0; j < size; j++){
    //             list.add(in.nextInt());
    //         }
    //         matrix.add(new ArrayList<>(list)); // Create a new list for each row to avoid reference issues
    //         list.clear(); // Clear the list for the next row
    //     }
    //     System.out.println(matrix);
    // }

     public static void main(String[] args) {
        // Example matrix represented as a list of lists
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(List.of(1, 2, 3))); // Use ArrayList to create a mutable list
        matrix.add(new ArrayList<>(List.of(4, 5, 6))); // Use ArrayList to create a mutable list
        matrix.add(new ArrayList<>(List.of(7, 8, 9))); // Use ArrayList to create a mutable list
        System.out.println(matrix);

        // Reverse the second row (index 1)
        Collections.reverse(matrix.get(1));

        // Print the matrix to see the change
        for (List<Integer> row : matrix) {
            System.out.println(row);
        }
    }
}
