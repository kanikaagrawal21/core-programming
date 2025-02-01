import java.util.*;
public class powerCalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int exp = in.nextInt();
        double ans = Math.pow(base,exp);
        System.out.println(ans);

    }
}
