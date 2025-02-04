import java.util.Scanner;

public class CounterFormForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i = num;i>0;i--){
            System.out.println(i);
        }
    }
}
