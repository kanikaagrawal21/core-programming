package com.method.LevelTwo;

import java.util.Scanner;

public class RootsOfQuadraticEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        findRoots(a, b, c);
    }
    public static void findRoots(double a, double b, double c) {
        double delta;
        delta = Math.pow(b, 2) + (4*a*c);

        if (delta>0) {
            double root1 = (-b + Math.sqrt(delta))/(2*a);
            double root2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println(root1);
            System.out.println(root2);
        } else if (delta == 0) {
            double root = -b/(2*a);
            System.out.println(root);
        } else {
            System.out.println("No roots");
        }

    }
}
