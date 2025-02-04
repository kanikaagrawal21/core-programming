package com.method.LevelThree;

import java.util.Arrays;
import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        System.out.println(euclideanDistance(x1,x2,y1,y2));
        System.out.println(Arrays.toString(equationOfLine(x1,x2,y1,y2)));
    }
    public static double euclideanDistance(int x1,int x2,int y1,int y2){
        return Math.sqrt(Math.pow(x2-x1,2))+Math.sqrt(Math.pow(y2-y1,2));

    }
    public static double[] equationOfLine(int x1,int x2,int y1,int y2){
        double[]array = new double[2];
        double m = (y2-y1)/(x2-x1);
        double b =y1 - m* x1;
        array[0]=m;
        array[1]=b;
        return array;
    }


}
