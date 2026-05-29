

import java.util.Scanner;

public class practrisezava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("plzz enter 1 num : ");
        double num1 = sc.nextDouble();

        System.out.println("plzz enter 2 num : ");
        double num2 = sc.nextDouble();

        System.out.println("choose operations ");
        System.out.println("+ for addition ");
        System.out.println("- for sub");
        System.out.println("* sor multi");
        System.out.println(" / for division ");

        System.out.println(" here  ur choise: ");
        char operation = sc.next().charAt(0);

        double result  ;

        switch(operation){
            case '+' :
                result=num1 +num2 ;
                System.out.println(result);
                break;
            case '-':
                result=num1 - num2 ;
                System.out.println(result);
                break;
            case '*':
                result=num1 * num2 ;
                System.out.println(result);
                break;
            case '/':
                result=num1  /num2 ;
                System.out.println(result);
                break;

            default:
                System.out.println("operation is invalid");

        }
        sc.close();

    }
}
