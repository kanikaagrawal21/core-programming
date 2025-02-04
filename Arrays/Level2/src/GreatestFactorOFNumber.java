import java.util.Scanner;

public class GreatestFactorOFNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
       int fact = 1;
       int max = 0;
        for(int i = 1;i<num;i++){
            if(num%i==0 && i>max){
                max = i;
            }

        }
        System.out.println(max);
    }
}
