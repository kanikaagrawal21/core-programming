import java.util.*;
public class HeightIntoFeetAndInches {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double heightInCm = in.nextDouble();
        double heightInFeet = (double)heightInCm/30.48;

        System.out.println(heightInCm+"cm and in feet "+heightInFeet);
    }
}
