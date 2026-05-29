//import java.util.Scanner;
//
//
//
//public class ques13 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextByte();
//
//        int fib =(n-1) + (n-2);
//        System.out.println(fib);
//    }
//}

import java.util.Scanner;

public class ques13 {


    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = fib(n);

        System.out.println("Fibonacci number is: " + result);

        sc.close();
    }
}