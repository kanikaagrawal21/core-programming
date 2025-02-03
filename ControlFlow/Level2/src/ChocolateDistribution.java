import java.util.*;
public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfChocolate = in.nextInt();
        int numOfStudent = in.nextInt();
        int numOfChocolatePerStudent = numOfStudent/numOfChocolate;
        int numOfRemainingChocolate = numOfStudent%numOfChocolate;
        System.out.println("number of chocolate per student is   "+numOfChocolatePerStudent+"   number of remaining chocolate   "+numOfRemainingChocolate);
    }
}
