import java.util.Scanner;

public class TotalPrice {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Enter unit price: ");
            double unitPrice = in.nextDouble();
            System.out.print("Enter quantity: ");
            int qty = in.nextInt();

            double totalPrice = calculatePrice(unitPrice, qty);
            System.out.println("The total purchase price is INR "+totalPrice + " if the quantity is "+qty + " and the unit price is INR " + unitPrice);
        }

        static double calculatePrice(double unitPrice, int qty) {
            return unitPrice*qty;
        }
    }

