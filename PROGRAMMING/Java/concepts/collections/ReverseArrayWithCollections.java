package concepts.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayWithCollections {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Non human-readable array: " + array);
        System.out.println("Original array converted to string: " + Arrays.toString(array));

        // Create an empty ArrayList of Integer objects
        // This list will be used to store the elements of the array
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate over each element in the array
        for (int num : array) {
            // Add each element to the ArrayList
            // This converts the array to an ArrayList
            list.add(num);
        }

        // Use the Collections.reverse method to reverse the order of elements in the ArrayList
        // This method modifies the ArrayList in place, meaning the original order of elements is changed
        Collections.reverse(list);
        System.out.println("Reversed collection: " + list);
        //***********************extras**************** */
        // Create a copy of the ArrayList
        // This step is crucial for preserving the original list.
        // By creating a new ArrayList that is a copy of the original list,
        // we ensure that any modifications we make will not affect the original list.
        ArrayList<Integer> reversedList = new ArrayList<>(list);

        // Reverse the copy of the ArrayList
        // Here, we use the Collections.reverse method to reverse the order of elements in the copy of the list.
        // Since this is a separate list from the original, the original list remains unchanged.
        Collections.reverse(reversedList);


        // Convert the ArrayList back to an array of Integer objects
        // This line is crucial for the final step of our process: converting the reversed ArrayList back into an array.
        // The toArray method is called on the ArrayList 'list', which contains the reversed elements of our original array.
        // The argument 'new Integer[0]' is used to specify the type of the array we want to create.
        // The '0' in 'new Integer[0]' might seem counterintuitive because it suggests an empty array,
        // but it's actually a trick to tell the toArray method that we want an array of Integer objects.
        // The toArray method then creates a new array of Integer objects with the same length as the ArrayList.
        // The elements of the ArrayList are copied into this new array in the same order they appear in the ArrayList.
        // Since we've reversed the ArrayList before this step, the new array will contain the elements of the original array in reverse order.
        // The result is assigned to the variable 'reversedArray', which now holds the reversed array of Integer objects.
        Integer[] reversedArray = list.toArray(new Integer[0]);

        //********************************************************* */
        // If you want to convert the ArrayList<Integer> back to an int[], you would need to manually convert each Integer to int and store them in a new int[]

        // // Convert the ArrayList back to an int[]
        // int[] reversedArray = new int[list.size()];
        // for (int i = 0; i < list.size(); i++) {
        //     reversedArray[i] = list.get(i);
        // }
        
        // // Print the reversed array
        // System.out.println("Reversed array: " + Arrays.toString(reversedArray));


        // Print the reversed array to the console
        // The Arrays.toString method is used to convert the array to a string representation
        // This makes it easier to print the array elements in a readable format
        System.out.println("Reversed converted from collection but not tostring array: "+reversedArray); // not human readable
        System.out.println("Reversed converted to string from collection array: " + Arrays.toString(reversedArray));
    }
}