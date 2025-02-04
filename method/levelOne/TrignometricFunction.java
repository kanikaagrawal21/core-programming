package com.method.levelOne;

import java.util.Scanner;

public class TrignometricFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angle = in.nextDouble();

        calculateTrignometric(angle);
    }

    public static void calculateTrignometric(double angle) {
        System.out.println(Math.sin(angle));
        System.out.println(Math.cos(angle));
        System.out.println(Math.tan(angle));
    }
}
