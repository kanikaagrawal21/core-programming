import java.util.*;
public class perimeterofRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int width = in.nextInt();
        int perimeter = 2*(length + width);
        System.out.println(perimeter);
    }
}
