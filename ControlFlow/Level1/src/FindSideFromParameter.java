import java.util.*;
public class FindSideFromParameter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int parameter = in.nextInt();
        int side  = parameter/4;
        System.out.println("side of square whose parameter   "+parameter + " is "+side);
    }
}
