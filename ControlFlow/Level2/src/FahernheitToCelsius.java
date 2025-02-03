import java.util.*;
public class FahernheitToCelsius {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temperatureInFahernheit = in.nextInt();
        int temperatureInCelsius = (temperatureInFahernheit-32)*5/9;
        System.out.println("temperature in celsius is  "+temperatureInCelsius);
    }
}
