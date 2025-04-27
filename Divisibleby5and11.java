import java.util.Scanner;

public class Divisibleby5and11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if (num % 5 ==0 && num % 11 == 0 ){
           System.out.print(num + " is divisible.");
        }else{
            System.out.print(num + " is not divisible.");
        }

}
}
