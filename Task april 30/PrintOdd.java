import java.util.Scanner;

public class PrintOdd{


  public static void oddnum(int a){
    

     for (int i = 1; i <= a; i++){
        if (i%2==0){
            // continue;
        }else{
            System.out.println(i);
        }
     }

  }

  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int a = sc.nextInt();

      oddnum(a);
  }

}