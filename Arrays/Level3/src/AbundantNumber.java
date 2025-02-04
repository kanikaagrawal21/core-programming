import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        for(int i = 1;i<num;i++){
            if(num%i==0){
                sum+=i;
            }

        }if(sum >= num){
            System.out.println("it is a abundant number");
        }else{
            System.out.println("it is not a abundant number");
        }

    }
}
