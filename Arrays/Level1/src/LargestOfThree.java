import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("num1 is largest ");

        } else if (num2>num1 && num2>num3) {
            System.out.println("num2 is largest");

        }else{
            System.out.println("num3 is largest");
        }
    }
}
