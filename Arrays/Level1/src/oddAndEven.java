import java.util.Scanner;

public class oddAndEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i +" is even");
            } else {
                System.out.println(i + " is odd");
            }
        }
    }
}
