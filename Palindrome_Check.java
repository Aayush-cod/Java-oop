import java.util.Scanner;

public class Palindrome_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Store the original number to compare later
        int originalNum = num;
        int reversed = 0;

        // Reverse the number using a loop
        while (num != 0) {
            int digit = num % 10;       // Extract the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            num /= 10;                  // Remove the last digit
        }

        // Check if the number is a palindrome
        if (originalNum == reversed) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }

        scanner.close();
    }
}
