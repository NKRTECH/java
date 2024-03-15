package concepts;

import java.util.Scanner;

public class Check_whether_first_letter_is_vowel {
    //**********my written code******** */
    // public static void main(String[] args) {
    //     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    //     Scanner in = new Scanner(System.in);
    //     String letter = in.nextLine();
    //     char a = letter.charAt(0);
    //     String vowels = "aeiou";
    //     if(vowels.indexOf(a)!=-1){
    //       System.out.print("Yes");
    //     }else{
    //       System.out.print("No");
    //     }
    // }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read the input string
    String input = scanner.nextLine();
        
    // Close the scanner to avoid resource leaks
    scanner.close();
        
    // Define the vowels
    String vowels = "aeiou";
        
    // Check if the first character is a vowel and print the result
    // This line does several things:
    // 1. input.charAt(0) gets the first character of the input string.
    // 2. Character.toLowerCase(input.charAt(0)) converts this character to lowercase.
    //    This is done to ensure the check is case-insensitive.
    // 3. + "" converts the character to a string. This is necessary because the contains method expects a string.
    // 4. vowels.contains(...) checks if the string of vowels contains the lowercase character.
    //    It returns true if the character is a vowel and false otherwise.
    // if (vowels.contains(Character.toLowerCase(input.charAt(0)) + "")) {
    //     System.out.println("Yes");
    // } 
    // else {
    //     System.out.println("No");
    // }
    //***************this is easy to understand ******* */
    if (vowels.contains(String.valueOf(Character.toLowerCase(input.charAt(0))))) {
        System.out.println("Yes");
    } 
    else {
        System.out.println("No");
    }
    }
}
