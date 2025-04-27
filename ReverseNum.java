import java.util.Scanner;

public class ReverseNum {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to store the reversed number
        int reversed = 0;

        // Loop to reverse the number
        while (num != 0) {
            int digit = num % 10;        // Extract the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            num /= 10;                   // Remove the last digit
        }

        // Display the reversed number
        System.out.println("Reversed number is: " + reversed);

        scanner.close();
    }
}
