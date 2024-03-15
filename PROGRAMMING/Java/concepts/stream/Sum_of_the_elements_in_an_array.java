package concepts.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sum_of_the_elements_in_an_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<s;i++){
          arr.add(in.nextInt());
        }
        // System.out.print(arr.stream().mapToInt(Integer::intValue).sum()); // this is using just passing method reference
        // System.out.println(arr.stream().mapToInt(num->num.intValue()).sum());  // this is using lambda expression
        System.out.println(arr.stream().mapToInt(num->num.intValue()).sum());  // this is using lambda expression
    }
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.println("Enter the number of elements:");
    //     int n = scanner.nextInt();

    //     System.out.println("Enter the elements:");
    //     int[] array = new int[n];
    //     for (int i = 0; i < n; i++) {
    //         array[i] = scanner.nextInt();
    //     }

    //     int sum = Arrays.stream(array).sum();
    //     System.out.println("Sum of elements: " + sum);

    //     scanner.close();
    // }
}

//********************************detailed explanation******************** */
// The :: symbol in Java is used for method reference. It's a shorthand notation for referring to a method without actually invoking it.

// There are four types of method references in Java:

// Reference to a static method: ClassName::staticMethodName
// Reference to an instance method of a particular object: objectReference::instanceMethodName
// Reference to an instance method of an arbitrary object of a particular type: ClassName::instanceMethodName
// Reference to a constructor: ClassName::new

// In the context of .mapToInt(Integer::intValue), Integer::intValue is a reference to the intValue() method of the Integer class. 
// It's equivalent to writing a lambda expression like this:
// num -> num.intValue()

// So, .mapToInt(Integer::intValue) is essentially saying: "For each element in the stream, apply the intValue() method of the Integer class."

//***************************************************************** */
// arr.stream(): This converts the ArrayList arr into a stream. A stream in Java is a sequence of elements that supports various operations.

// .mapToInt(Integer::intValue): This part of the code applies a transformation to each element of the stream. Let's break it down further:

// mapToInt: This is a method provided by the Stream API in Java. It's used to transform each element of the stream into an int.

// Integer::intValue: This part is a method reference. In Java, Integer is a wrapper class for the primitive int. 
// The intValue() method is a method of the Integer class that converts an Integer object to its corresponding int primitive value. 
// So Integer::intValue refers to the intValue() method of the Integer class.

// Putting it together, mapToInt(Integer::intValue) applies the intValue() method to each element of the stream, converting each Integer object to its corresponding int primitive value.