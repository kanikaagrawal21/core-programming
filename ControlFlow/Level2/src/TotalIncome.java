import java.util.*;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int salary = in.nextInt();
        int bonus = in.nextInt();
        int totalIncome = salary+bonus;
        System.out.println("total income is " +totalIncome);
    }
}
