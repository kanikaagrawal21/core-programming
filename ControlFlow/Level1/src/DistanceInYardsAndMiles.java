import java.util.Scanner;

public class DistanceInYardsAndMiles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double feet = in.nextDouble();
        convertDistance(feet);
    }

    static void convertDistance(double feet) {
        double yards = feet/3;
        double miles = yards/1760;

        System.out.println(feet + " feet is equals to "+ yards +" yards or "+ miles + " miles.");
    }
}
