import java.util.Scanner;
public class ConvertintoMonthDays {
    static void conversion(int a){
         int years = a/365;
         int month = (a-(years * 365))/30;
         int days = a-(years * 365+month * 30);

         System.out.println(years);
         System.out.println(month);
         System.out.println(days);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days: ");
        int a = sc.nextInt();

        // int a = 500;

        conversion(a);

        sc.close();
    }
}
