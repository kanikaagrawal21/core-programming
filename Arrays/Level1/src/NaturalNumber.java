import java.util.Scanner;

public class NaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0){

                int sum = n * (n+1) / 2;
           System.out.println(sum);

        }else{
            System.out.println("not a natural no.");
        }
    }
}
