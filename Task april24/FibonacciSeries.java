import java.util.Scanner;

public class FibonacciSeries {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number n
        System.out.print("Enter a number (n): ");
        int n = scanner.nextInt();

        // Variables to store the first two terms of the Fibonacci series
        int first = 0, second = 1;

        // Print the first n terms of the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");

        // Loop to generate and print the Fibonacci series
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            // Update the values of first and second
            int next = first + second;
            first = second;
            second = next;
        }

        scanner.close();
    }
}
