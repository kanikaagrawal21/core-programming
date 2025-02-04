package com.method.LevelTwo;

import java.util.Scanner;

public class unitConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double km = in.nextDouble();
        double miles = in.nextDouble();
        double feet = in.nextDouble();
        double meter = in.nextDouble();

        System.out.println(kilometerToMiles(km));
        System.out.println(milesToKilometer(miles));
        System.out.println(feetToMeter(feet));
        System.out.println(metersToFeet(meter));
    }
    public static double kilometerToMiles(double km){
        return km*0.621371;

    }public static double milesToKilometer(double miles){
        return miles*1.60934;
    }
    public static double metersToFeet(double meter){
        return meter*3.28084;
    }
    public static double feetToMeter(double feet){
        return feet* 0.3048;
    }
}
