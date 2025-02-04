import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean isprime = false;
        for(int i=2;i<num;i++){
            if(num% i !=0){
                isprime = true;
                break;
            }
            System.out.println(isprime);
        }
    }
}
