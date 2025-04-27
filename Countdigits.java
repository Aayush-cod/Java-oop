import java.util.Scanner;

public class Countdigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to count digits
        int digitCount = 0;

        // Handle the case where the number is 0
        if (num == 0) {
            digitCount = 1;
        } else {
            // Loop to count the digits
            while (num != 0) {
                num /= 10;  // Remove the last digit
                digitCount++;  // Increment the digit count
            }
        }

        // Display the number of digits
        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
