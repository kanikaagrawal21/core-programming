import java.util.Scanner;

public class PositiveNegitiveOrZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
          if (number == 0){
              System.out.println("no. is 0");

          } else if (number>0) {
              System.out.println("number is positive");

          }else{
              System.out.println("number is negative");
          }
    }
}
