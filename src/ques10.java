import java.util.Scanner;
import java.util.Random;


public class ques10{
    public static void main(String[] args) {
  Random random = new Random () ;
  Scanner scanner = new Scanner (System.in);

  int secretNumber = random.nextInt(100) +1;

  int guess;

        System.out.println("GUess a  number between 1 and 100");
    do {
        System.out.println("enter your guess: ");
        guess= scanner.nextInt();

        if (guess > secretNumber){
            System.out.println("too high");
        }
        else {
            System.out.println("too low");
        }

    }while (guess != secretNumber);
    }
}
