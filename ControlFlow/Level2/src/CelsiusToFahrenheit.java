import java.util.*;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temperatureInCelsius = in.nextInt();
        int temperatureInFahrenheit = (temperatureInCelsius * 9/5) + 32;
         System.out.println("temprature in fahernheit is  "+temperatureInFahrenheit);


    }
}
