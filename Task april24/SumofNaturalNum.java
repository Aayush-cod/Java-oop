import java.util.Scanner;

public class SumofNaturalNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Calculate sum using loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Display the sum
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        scanner.close();
    }
}
