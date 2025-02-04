import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int ans = 0;
        char operator = in.next().charAt(0);

        switch (operator) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
            case '*':
                ans = num1 * num2;
            case '/':
                ans = num1 / num2;

        }
    }
}