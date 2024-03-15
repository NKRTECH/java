package concepts;

import java.util.Scanner;

public class MoveHashesToStart {

    //*******************my written code**************** */

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        StringBuilder hash = new StringBuilder();
        StringBuilder alph = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '#') {
                hash.append(c);
            } else {
                alph.append(c);
            }
        }
        System.out.print(hash.toString() + alph.toString());
    }

    //********************AI Generated Code**************** */

    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     System.out.println("Enter a string with hashes:");
    //     String input = in.nextLine();
    //     in.close();

    //     StringBuilder output = new StringBuilder();
    //     for (char c : input.toCharArray()) {
    //         if (c == '#') {
    //             output.insert(0, c); // Insert hash at the beginning of the output
    //         } else {
    //             output.append(c); // Append non-hash characters to the end of the output
    //         }
    //     }

    //     System.out.println(output.toString());
    // }
}
