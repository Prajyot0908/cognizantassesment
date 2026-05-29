import java.util.Scanner ;

public class ques4 {
    public static void main(String[] args) {
        System.out.println(" enter year ");
  Scanner sc = new Scanner(System.in);
  int year = sc.nextInt();
  if ((year%4 ==0 && year%100 !=0)||(year%400 ==0)){
            System.out.println("this is leap year");
        }
  else{
            System.out.println("its not leap year");
        }

    }
}
