import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Initialize factorial result
        long factorial = 1;

        // Calculate factorial using a loop
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        // Display the factorial
        System.out.println("Factorial of " + num + " is: " + factorial);

        scanner.close();
    }
}
