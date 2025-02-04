package com.method.levelOne;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temp = in.nextDouble();
        double windSpeed = in.nextDouble();
        System.out.println(CalculationOfWindChill(temp,windSpeed));
    }
    public static double CalculationOfWindChill(double temp,double windSpeed){
       double windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * Math.pow(windSpeed,0.16);
       return windChill;
    }
}
