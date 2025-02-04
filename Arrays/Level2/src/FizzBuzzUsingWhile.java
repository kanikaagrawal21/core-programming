import java.util.Scanner;

public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 0;
        while (i<=num){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("buzz");

            } else if (i%3==0) {
                System.out.println("fizz");

            }else{
                System.out.println(i);
            }
            i++;
        }

    }
}
