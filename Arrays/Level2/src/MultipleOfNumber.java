import java.util.Scanner;

public class MultipleOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i =100;i>=1;i--){
            if(i%num==0){
                System.out.println(i);
            }
        }
    }
}
