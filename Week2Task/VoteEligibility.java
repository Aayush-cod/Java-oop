import java.util.Scanner;

public class VoteEligibility{
   
    static void eligibility(int age){

        if ( age < 18){
            System.out.print("Not Eligible to vote.");
        }else{
            System.out.print("Eligible to vote.");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        eligibility(age);


    }
}