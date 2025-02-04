import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int fact = 1;
        while(number>1){
             fact*= number ;
              number--;
        }
        System.out.println(fact);

    }
}
