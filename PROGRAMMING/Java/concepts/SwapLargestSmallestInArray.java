package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwapLargestSmallestInArray {

  //**********************method 1**************** */
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     int size = scanner.nextInt();
    //     List<Integer> list = new ArrayList<>();

    //     // Read the array elements and add them to the list
    //     for (int i = 0; i < size; i++) {
    //         list.add(scanner.nextInt());
    //     }

    //     // Find the largest and smallest elements
    //     int largestIndex = list.indexOf(Collections.max(list));
    //     int smallestIndex = list.indexOf(Collections.min(list));

    //     // Swap the largest and smallest elements
    //     Collections.swap(list, largestIndex, smallestIndex);

    //     // Print the modified list
    //     for (int num : list) {
    //         System.out.print(num + " ");
    //     }
    // }

    //**********************method 2**************** */

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int size = in.nextInt();
    //     List<Integer> list = new ArrayList<>();
    //     for(int i=0;i<size;i++){
    //       list.add(in.nextInt());
    //     }
    //     int max = Collections.max(list);
    //     int min = Collections.min(list);
        
    //     // Find the indices of the first occurrence of the min and max values
    //     int minIndex = list.indexOf(min);
    //     int maxIndex = list.indexOf(max);
        
    //     // Swap the elements at the minIndex and maxIndex
    //     list.set(minIndex, max);
    //     list.set(maxIndex, min);
        
    //     // Print the modified list
    //     for(int i=0;i<size;i++){
    //       System.out.print(list.get(i) + " ");
    //     }
    // }
    
    //**************this logic of code failed if there is duplication of smallest or largest numbers******/
    public static void main(String[] args) {
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      List<Integer> list = new ArrayList<>();
      for(int i=0;i<size;i++){
        list.add(in.nextInt());
      }
      int max = Collections.max(list);
      int min = Collections.min(list);
      list.set(list.indexOf(min),max);
      list.set(list.indexOf(max),min);
      for(int i=0;i<size;i++){
        System.out.print(list.get(i)+" ");
      }
  }
}
