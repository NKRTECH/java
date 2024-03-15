package control_advanced;

import java.util.Scanner;

public class RemoveSpecialCharacters {
    
    //**********************method 1 using stringbuilder**************** */
    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String input = scanner.nextLine(); // Read the input string

    //     StringBuilder output = new StringBuilder();
    //     for (char c : input.toCharArray()) {
    //         if (Character.isLetter(c)) {
    //             output.append(c);
    //         }
    //     }

    //     System.out.println(output.toString()); // Print the final string without any special characters
    // }

    //**********************method 2 by adding to string directly*****************/

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String res="";
        for(char c: str.toCharArray()){
          if(Character.isLetter(c)){
            res += c;
          }
        }
        System.out.print(res);
    }
}
