 import java.util.Scanner;
public class gradecal {
    public static void main(String[] args) {
        System.out.println("plz enter ur marks ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        if (marks>=90){
            System.out.println("A grade");}
           else if  ( 80<marks && marks<=89){
                System.out.println(" B grade");
            }
        else if  ( 70<marks && marks<=79){
            System.out.println("  c grade");
        }
        else if  ( 60<marks && marks<=69){
            System.out.println("  d grade");
        }


        else {
            System.out.println("got f grade dude");
        }
        }
    }

