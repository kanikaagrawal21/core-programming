import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sum = 0.0;
        double num =  in.nextDouble();
        while(num!=0){
            sum+= num;
            num = in.nextDouble();
        }
        System.out.println(sum);


    }
}
