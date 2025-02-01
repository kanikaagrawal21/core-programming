import java.util.*;
public class celsiustoFahrenheit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tempincelsius = in.nextInt();
        double tempinfahrenheit =  (tempincelsius * 9/5) + 32;
        System.out.println(tempinfahrenheit);

    }
}
