import java.util.Scanner;

public class AverageValue{

    static void averageofarray(int[] arr){

        int len = arr.length;
        int sum = 0;
        int count = 0;
       
        for(int i = 0; i < len-1; i++ ){
            sum += arr[i];
            count += 1;
        }

        int average = sum/count;
        System.out.println("The total average is"+average);

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
          System.out.println("Enter array values: ");
          arr[i]= sc.nextInt();
        }
        

        averageofarray(arr);
    }
}