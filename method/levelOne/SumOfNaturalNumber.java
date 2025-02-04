package com.method.levelOne;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(NaturalNumber(n));

    }
    public static int NaturalNumber(int n){
        if(n>0) {


            int sum = n * (n + 1) / 2;
            return sum;
        }
        return -1;
    }
}
