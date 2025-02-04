import java.util.Scanner;

public class FristIsSmallest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("yes first number is smaller then second and third");

        }else{
            System.out.println("no first is not smalller");
        }
    }
}
