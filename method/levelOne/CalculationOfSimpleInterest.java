package com.method.levelOne;

import java.util.Scanner;

public class CalculationOfSimpleInterest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int principal = in.nextInt();
        int rate = in.nextInt();
        int time = in.nextInt();
        System.out.println(SimpleInterest(principal,rate,time));


    }

    public  static int SimpleInterest(int principal, int rate, int time) {
        int simpleInterest = principal * rate * time / 100;
        return simpleInterest;

    }
}