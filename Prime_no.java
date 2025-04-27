import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check from 2 to num-1
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }

        scanner.close();
    }
}
