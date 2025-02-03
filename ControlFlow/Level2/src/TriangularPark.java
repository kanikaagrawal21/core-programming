import java.util.*;
public class TriangularPark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        int parameter = side+side+side;
        int numOfRounds = 5000/parameter;
        System.out.println("number of round cover by athlete is " +numOfRounds);

    }
}
