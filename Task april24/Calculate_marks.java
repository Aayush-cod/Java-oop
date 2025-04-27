import java.util.Scanner;

public class Calculate_marks {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks of five subjects
        System.out.print("Enter marks of Subject 1: ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter marks of Subject 2: ");
        int sub2 = scanner.nextInt();

        System.out.print("Enter marks of Subject 3: ");
        int sub3 = scanner.nextInt();

        System.out.print("Enter marks of Subject 4: ");
        int sub4 = scanner.nextInt();

        System.out.print("Enter marks of Subject 5: ");
        int sub5 = scanner.nextInt();

        // Calculate total and percentage
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total / 5.0);

        // Display total and percentage
        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        // Determine grade
        if (percentage >= 90) {
            System.out.println("Grade: A+");
        } else if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        scanner.close();
    }
}
