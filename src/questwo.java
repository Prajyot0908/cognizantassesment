import java.util.Scanner;

public class questwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==0){
            System.out.println("even num");
        }
        else if (n%2!=0){
            System.out.println("this is odd");
        }
        else {
            System.out.println("this  num is even");
        }

    }
}
