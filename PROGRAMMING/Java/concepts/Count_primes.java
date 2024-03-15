package concepts;

import java.util.Scanner;

public class Count_primes {
    //
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[6];
        String inputLine = in.nextLine();
        Scanner lineScanner = new Scanner(inputLine);
        for (int i = 0; i < 6; i++) {
            arr[i] = lineScanner.nextInt();
        }

        int count = 0;
        for (int i = 0; i < 6; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }

        System.out.println("Count of prime numbers: " + count);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //*********************if input is on next line**********/
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     Integer[] arr = new Integer[6];
    //     for (int i = 0; i < 6; i++) {
    //         arr[i] = Integer.valueOf(in.nextLine());
    //     }

    //     int count = 0;
    //     for (int i = 0; i < 6; i++) {
    //         if (isPrime(arr[i])) {
    //             count++;
    //         }
    //     }

    //     System.out.println("Count of prime numbers: " + count);
    // }

    // private static boolean isPrime(int num) {
    //     if (num <= 1) {
    //         return false;
    //     }
    //     for (int i = 2; i * i <= num; i++) {
    //         if (num % i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }


}
