import java.sql.SQLOutput;

public class CourseFeeAfterDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discount = 10;
        double feeAfterDiscount = fee*discount/100;
        System.out.println("fees after 10% of discount is " +feeAfterDiscount);
    }
}
