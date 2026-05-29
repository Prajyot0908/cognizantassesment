public class ques12 {
    static int add(int a , int b){return a + b ;}

    static double add (double a ,  double b){return a + b;}

    static int add(int a , int b , int c){ return a + b ;}





    public static void main(String[] args) {
         int num1= add(3 , 4);
         double d1 = add(4.4 , 5.5);
         int num3;
        num3 = add(4 , 5, 6);

        System.out.println(num1 );
        System.out.println(d1);
        System.out.println(num3 );
    }
}
