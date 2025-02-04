package com.method.levelOne;

import java.util.Arrays;
import java.util.Scanner;

public class DistributionOfChocolate {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int numOfStudent = in.nextInt();
     int numOgChocolate = in.nextInt();
        System.out.println(Arrays.toString(Distribution(numOfStudent,numOgChocolate)));


    }
    public static int[] Distribution(int numOfStudent,int numOfChocolate ){
        int numOfChocolatePerStudent = numOfStudent/numOfChocolate;
        int numOfRemainingChocolate = numOfStudent%numOfChocolate;
        int[]chocolates = new int[2];
        chocolates[0]=numOfChocolatePerStudent;
        chocolates[1]=numOfRemainingChocolate;
        return chocolates;
    }
}
