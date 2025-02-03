import java.util.*;
public class calculationOfFee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int fees = in.nextInt();
        int discountPercent = in.nextInt();
        int feesAfterDiscount = fees*discountPercent/100;
        System.out.println("fees after "+discountPercent+ "% of discount is  "+feesAfterDiscount);

    }
}
