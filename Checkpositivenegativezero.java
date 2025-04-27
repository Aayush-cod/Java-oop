import java.util.Scanner;

public class Checkpositivenegativezero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.print("It is positive.");
        }else if(num < 0){
            System.out.print("It is negative.");

        }else{
            System.out.print("It is Zero.");
        }
    }
}
