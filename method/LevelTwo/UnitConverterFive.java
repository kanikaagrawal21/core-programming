package com.method.LevelTwo;

import java.util.Scanner;

public class UnitConverterFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double yards = in.nextDouble();
        double feet = in.nextDouble();
        double meter = in.nextDouble();
        double inches = in.nextDouble();

        System.out.println(yardsToFeet(yards));
        System.out.println(feetToYards(feet));
        System.out.println(metersToInches(meter));
        System.out.println(inchesToMeters(inches));
        System.out.println(inchesToCm(inches));
    }
    static double yardsToFeet(double yards) {
        return yards*3;
    }
    static double feetToYards(double feet) {
        return feet*0.333333;
    }

    static double metersToInches (double meter) {
        return meter*39.3701;
    }
    static double inchesToMeters(double inches) {
        return inches*0.0254;
    }
    static double inchesToCm(double inches) {
        return inches*2.54;
    }
}
