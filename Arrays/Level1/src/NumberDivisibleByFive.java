import java.util.Scanner;

public class NumberDivisibleByFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number%5==0){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
