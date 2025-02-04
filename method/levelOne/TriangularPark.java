package com.method.levelOne;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        System.out.println(AthleteRunTriangularPark(side));

    }
    public static int AthleteRunTriangularPark(int side){

        int parameter = side+side+side;
        int numOfRounds = 5000/parameter;
       return numOfRounds;
    }

}
