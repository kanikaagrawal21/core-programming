import  java.util.*;
public class PoundsToKilogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weightInPounds = in.nextInt();
        double weightInKilogrqam =(double) weightInPounds/2.2;
        System.out.println("the weight in kilogram is "+weightInKilogrqam);
    }
}
