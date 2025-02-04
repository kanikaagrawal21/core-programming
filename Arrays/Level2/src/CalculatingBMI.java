import java.util.Scanner;

public class CalculatingBMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double weight = in.nextDouble();
        double height = in.nextDouble();
        double heightInMeter =(double) height * 0.01;
        double bmi = weight/(heightInMeter*heightInMeter);
        if(bmi<=18.4){
            System.out.println("underweight");
        } else if (bmi>=18.5 && bmi<=24.9) {
            System.out.println("Normal");

        } else if (bmi>=25.0&& bmi<=39.9) {
            System.out.println("overweight");
        } else if (bmi>=40.0) {
            System.out.println("obese");
        }

    }
}
