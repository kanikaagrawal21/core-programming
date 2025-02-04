package com.method.levelOne;

import java.util.Scanner;

public class NumberIsPositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        System.out.println(PositiveNegativeOrZero(num));


    }
    public static String PositiveNegativeOrZero(int num){
        if (num == 0){
            return ""+0;

        } else if (num>0) {
            return "positive";

        }else{
            return "negative";
        }
    }
}
