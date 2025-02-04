package com.method.levelOne;

import java.util.Scanner;

public class SmallestAndLargestOfThreeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        System.out.println(LargestAndSmallest(num1,num2,num3));

    }
    public static int LargestAndSmallest(int num1,int num2 ,int num3){
        int largest = 0;
        int smallest = 9000;
        System.out.println("largest is");
        if(num1>num2 && num1>num3){
            return num1;
        }else if (num2>num1 && num2>num3){
            return num2;
        }else if(num3>num1 && num3>num1) {
            return num3;
        }
        System.out.println("smallest is");
        if(num1<num2 && num1<num3){
            return num1;

        } else if (num2<num1 &&num2<num3) {
              return num2;

        }else{
            return num3;
        }

    }
}
