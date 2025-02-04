package com.method.LevelTwo;

import java.util.Arrays;
import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();

        int[] factors = factors(number);

        System.out.println(Arrays.toString(factors));
        System.out.println(sumOfFactors(factors));
        System.out.println(productOfFactors(factors));
        System.out.println(sumOfSquareOfFactors(factors));

    }
    static int counter =0;
    public static int[] factors(int number){
        int[]factors = new int[number];

        for(int i = 1;i<number;i++){
            if(number%i==0){
                factors[counter]=i;
                counter++;

            }
        }
        return factors;
    }

    static int sumOfFactors(int[] factors){
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += factors[i];
        }
        return sum;
    }

    static int productOfFactors(int[] factors){
        int prod = 1;
        for (int i = 0; i < counter; i++) {
            prod *= factors[i];
        }
        return prod;
    }

    static int sumOfSquareOfFactors(int[] factors){
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += Math.pow(factors[i], 2);
        }
        return sum;
    }





}
