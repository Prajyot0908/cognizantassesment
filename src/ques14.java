import java.util.Scanner;

public class ques14 {
    public static void main(String[] args) {

        System.out.println("enter length of array");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        int sum=0;

        System.out.println("enetr ur elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("sum is "+sum);
    double average = sum/n;
        System.out.println( "avg is "+ average);

    }
}