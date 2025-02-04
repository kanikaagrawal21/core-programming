import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i= 1;i<=num;i++){

            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            } else if (i%5==0) {
                System.out.println("buzz");
            } else if(i%3==0 ){
                System.out.println("fizz");
            } else{
                System.out.println(i);
            }
        }
    }
}
