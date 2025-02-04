import java.util.Scanner;

public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int yearOfService = in.nextInt();
        int Salary = in.nextInt();
         int BonusAmount = 0;
        if(yearOfService>5){
             BonusAmount = (Salary)*5/100;
        }
        System.out.println("BonusAmount "+ BonusAmount);
    }
}
