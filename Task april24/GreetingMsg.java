import java.util.Scanner;

public class GreetingMsg {
    public  static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your name: ");
       String name = sc.next();

       if (name.equals("") ){
        System.out.print("Please enter your name!");

       } else{
        System.out.print("Hello " +name);
       }
    }
}