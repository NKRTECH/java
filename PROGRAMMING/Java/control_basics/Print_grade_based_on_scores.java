package control_basics;

import java.util.Scanner;

public class Print_grade_based_on_scores {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        scanner.close();

        if (score < 0 || score > 100) {
            System.out.println("Invalid input");
        } else {
            if (score >= 81) {
                System.out.println("S");
            } else if (score >= 71) {
                System.out.println("A");
            } else if (score >= 61) {
                System.out.println("B");
            } else if (score >= 51) {
                System.out.println("C");
            } else if (score >= 40) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }
}
