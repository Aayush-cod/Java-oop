
import java.util.Scanner;


public class Harshadnumber {
    static void harshadnum(int a){
        int sum = 0;
        int original = a;

        while(a != 0){
            sum += a % 10;
            a/=10;

    
        }

        if (original%sum == 0){
            System.out.println("It is a harshad number.");
        }else{
            System.out.println("Not a harshad number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        harshadnum(a);
    }
}
