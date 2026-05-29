import java.util.Scanner;

public class ques11 {
    public static void main(String[] args) {
        System.out.println(" plzz neter ur number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1;

         for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }


        System.out.println("Factorial of " + num + " is: " + factorial);
    }


}
