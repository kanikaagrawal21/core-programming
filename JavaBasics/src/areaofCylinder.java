import java.util.*;
public class areaofCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        double area = (22/7)*radius*radius*height;
        System.out.println(area);
    }
}
