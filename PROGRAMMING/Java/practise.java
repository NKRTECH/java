// public class practise {    
// public static void main(String[] args) {    
// String[] names = {"Java","C","C++","Python","JavaScript"};    
// System.out.println("Printing the content of the array names:\n");    
// for(String name:names) {    
// System.out.println(name);    
// }    
// }    
// }    
// import java.util.*;  

// public class practise {
//     public static void main(String[] args) {
//         // Create a Scanner object
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for an integer
//         System.out.print("Enter an integer: ");
//         int number = scanner.nextInt();

//         // Prompt the user for a string
//         System.out.print("Enter a string: ");
//         // scanner.nextLine(); // This is necessary to consume the newline left-over
//         String text = scanner.nextLine();

//         // Display the input
//         System.out.println("You entered the integer: " + number);
//         System.out.println("You entered the string: " + text);

//         // Close the scanner
//         scanner.close();
//     }
// }

import java.util.ArrayList;
import java.util.Scanner;

public class practise {
    
    // public static void main(String[] args) {

    //     Scanner scanner = new Scanner(System.in);

    //     // Create an ArrayList
    //     ArrayList<Integer> numbers = new ArrayList<>();

    //     // Prompt the user to enter numbers
    //     System.out.println("Enter integers (type 'done' to finish):");
    //     while (true) {
    //         System.out.print("Enter number: ");
    //         String input = scanner.nextLine();
    //         if (input.equalsIgnoreCase("done")) {
    //             break; // Exit the loop if the user types 'done'
    //         }
    //         numbers.add(Integer.parseInt(input)); // Add the number to the ArrayList
    //     }

        // Display the ArrayList
        // System.out.print("You entered:");
        // System.out.println(numbers);
        // for (int number : numbers) {
        //     System.out.println(number);
        // }

        // Close the scanner
        // scanner.close();
    // }
    // public static void main(String args[]){  
    //     // int value=30;  
    //     // String s1=String.valueOf(value);  
    //     // System.out.println(s1+10);//concatenating string with 10 

    //     // Without Generics:
    //     // This is like a box that can hold any type of toy.
    //     ArrayList box = new ArrayList<>();
            
    //     // You can put any type of toy in the box.
    //     box.add("Toy Car");
    //     box.add(123); // This is not a toy, but the box doesn't care.
    //     box.add(3.14f);
    //     box.add('a');
    //     box.add(true);
    //     System.out.println(box);

    //     // With Generics:
    //     // This is like a box that is specifically designed to hold only toy cars.
    //     ArrayList<String> toyCarBox = new ArrayList<String>();
    //     // You can only put toy cars in this box.
    //     toyCarBox.add("Toy Car");
    //     // toyCarBox.add(123); // This line would cause an error because 123 is not a toy car.
    //     // toyCarBox.add(3.14f); // This line would cause an error because 3.14 is not a toy car.
    //     // toyCarBox.add('a');
    //     // toyCarBox.add(true);
    //     System.out.println(toyCarBox);
    //     }  
        
}
