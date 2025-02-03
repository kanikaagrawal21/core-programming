import java.util.Scanner;

public class TotalDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String fromCity = in.next();
        double distanceFromToVia = in.nextDouble();
        int timeFromToVia = in.nextInt();
        double distanceViaToFinalCity = in.nextDouble();
        int timeViaToFinalCity = in.nextInt();
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by"+name+"from"+fromCity+"distance via"+distanceFromToVia+"time taken form"+timeFromToVia+"to"+distanceViaToFinalCity+"time to reach final"+timeViaToFinalCity+"therefore the total distance covered is"+totalDistance+"total time taken to cover distance"+totalTime);

    }
}
