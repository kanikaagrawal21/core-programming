package com.method.LevelTwo;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(sumOfNaturalNumByRecursion(number));
        System.out.println(sumOfNaturalNumber(number));
    }

    static int sumOfNaturalNumByRecursion(int number) {
        if(number==0){
            return 0;
        }
        return number+sumOfNaturalNumByRecursion(number-1);
    }

    static int sumOfNaturalNumber(int number) {
        return (number*(number+1))/2;
    }


}
