package variables;

public class Extract2ndlastdigit {
    public static void main(String[] args) {
        int number = 12345; // Example number
        int lastDigit = number / 10; // Extracts the last digit
        int secondLastDigit = lastDigit % 10; // Initialize second last digit

        // // Keep dividing the number by 10 until it's less than 10
        // while (number >= 10) {
        //     number /= 10; // Divide the number by 10
        //     secondLastDigit = lastDigit; // The last digit becomes the second last digit
        //     lastDigit = number % 10; // Update the last digit
        // }

        System.out.println("The second last digit of " + number + " is " + secondLastDigit);
    }
}