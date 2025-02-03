import java.util.*;
public class ConvertKilometerToMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int distanceInKilometer = in.nextInt();
        double distanceInMiles = distanceInKilometer*1.6;
        System.out.println("distance in miles  "+distanceInMiles);
    }
}
