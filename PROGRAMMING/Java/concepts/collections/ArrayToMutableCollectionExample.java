package concepts.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToMutableCollectionExample {
    public static void main(String[] args) {
        // Original array
        String[] countries = {"India", "Pakistan", "Afghanistan", "Srilanka"};

        // Convert array to mutable ArrayList
        ArrayList<String> countryList = new ArrayList<>(Arrays.asList(countries));

        // Now you can add, remove, or modify elements in countryList
        countryList.add("Bangladesh"); // Add an element
        countryList.remove("Afghanistan"); // Remove an element
        System.out.println("Modified elements: " + countryList);
    }
}
