package control_basics;

import java.util.Scanner;

public class Find_the_minimum_number_of_moves {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int s = Math.abs(b - a);
        if (s >= 1 && s <= 10) {
            System.out.println(1);
        } else if (s > 10) {
            if (s % 10 == 0) {
                System.out.println(s / 10);
            } else {
                System.out.println((s / 10) + 1);
            }
        } else if (s == 0) {
            System.out.println(0);
        }
    }
}
