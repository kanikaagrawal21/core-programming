import java.util.Scanner;

public class CountDownFromWhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = num;
        while(count !=0){
            System.out.println(count);
            count--;
        }
    }
}
