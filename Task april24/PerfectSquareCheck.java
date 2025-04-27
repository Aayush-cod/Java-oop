import java.util.Scanner;

public class PerfectSquareCheck {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Variable to check if the number is a perfect square
        boolean isPerfectSquare = false;

        // Check for perfect square using a loop
        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfectSquare = true;
                break;
            }
        }

        // Display result
        if (isPerfectSquare) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }

        scanner.close();
    }
}
