import java.util.*;
public class CalculateSimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int rate = in.nextInt();
        int principal = in.nextInt();
        int simpleInterest = principal * rate * time / 100;

    }
}
