import java.util.*;
public class converttoMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double kilometer = in.nextDouble();
        double miles = kilometer * 0.621371;
        System.out.println(miles);
    }
}
