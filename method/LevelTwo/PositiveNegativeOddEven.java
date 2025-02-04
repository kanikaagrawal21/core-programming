package com.method.LevelTwo;

import java.util.Scanner;

public class PositiveNegativeOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] number = new int[5];
        for(int i =0;i<5;i++){
            number[i]=in.nextInt();
            if (isPositive(number[i])) {
                System.out.println("Positive");
                if (isEven(number[i])){
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }
        System.out.println(compare(number[0], number[4]));


    }
    public static int compare(int num1, int num2){
        if(num1>num2){
            return 1;
        } else if (num1==num2) {
            return 0;
        }
        return -1;

    }
    public static boolean isPositive(int num){
        if(num>0){
            return true;
        }
        return false;
    }
    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
}
