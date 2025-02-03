import java.util.*;
public class QuotientAndReminder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int quotient = num1/num2;
        int remainder = num1%num2;
        System.out.println("quotient and remainder of two is  "+quotient+"  and  "+ remainder);
    }
}
