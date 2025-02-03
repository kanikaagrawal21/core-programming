public class CalculateProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice-costPrice;
        double profitPercentage = (double)profit/costPrice*100;
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191\n");
        System.out.println("The Profit is INR  "+profit+ "  and the Profit Percentage is "+profitPercentage);

    }
}
