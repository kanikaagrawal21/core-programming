import java.util.Scanner;

public class AdditionOfTwoNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number1 = in.nextInt();
        int number2 = in.nextInt();
        while(number1 !=0 || number2 !=0){
            int sum = number1+number2;
            System.out.println(sum);
        }
    }
}
