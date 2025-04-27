import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to store the sum of digits
        int sum = 0;

        // Loop to find the sum of digits
        while (num != 0) {
            sum += num % 10;  // Extract the last digit
            num /= 10;         // Remove the last digit
        }

        // Display the sum of digits
        System.out.println("Sum of digits is: " + sum);

        scanner.close();
    }
}
