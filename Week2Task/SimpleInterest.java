import java.util.Scanner;

public class SimpleInterest {
    static float incalcInterest(float principle, float time, float rate){
        float interest = (principle * time * rate)/100;
        return interest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your principle: ");
        float principle = sc.nextFloat();
        System.out.print("Enter your time in years: ");
        float time = sc.nextFloat();
        System.out.print("Enter your rate: ");
        float rate = sc.nextFloat();

        float interest = incalcInterest(principle, time, rate);
        System.out.print("Total Interest is : "+ interest);


    }
}
