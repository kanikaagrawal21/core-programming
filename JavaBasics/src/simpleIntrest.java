import java.util.*;
public class simpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int principal = in.nextInt();
        int time = in.nextInt();
        int rate = in.nextInt();
        int simpleIntrest = (principal * rate * time) / 100;
        System.out.println(simpleIntrest);
    }
}
