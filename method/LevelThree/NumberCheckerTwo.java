package com.method.LevelThree;

import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerTwo {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
        System.out.println(Arrays.toString(digitInArray(num)));
        digitInArray(num);
        System.out.println(isDuck(digitInArray(num)));
        System.out.println("number of digit  "+counter);
        largestAndSecondLargest(digitInArray(num));
        System.out.println(sum(digitInArray(num)));
        System.out.println(reverse(digitInArray(num)));



    }
    static int counter = 0;
    public static int[] digitInArray(int num) {

        Scanner in = new Scanner(System.in);
        int[] digit = new int[10];
        int counter = 0;
        while (num != 0) {
            int number = num % 10;
            digit[counter] = number;
            counter++;
            if (counter == digit.length) {
                int[] doubleDigit = new int[digit.length * 2];
                for (int i = 0; i < counter; i++) {
                    doubleDigit[i] = digit[i];
                }
                digit = doubleDigit;
            }
            num = num / 10;

        }

       return digit;

    }
    public static boolean isDuck(int[]digit){
        for(int i=0;i< counter;i++){
            if(digit[i]==0){
                return false;
            }

        }
        return true;
    }
    public static void largestAndSecondLargest(int[]digit){
        int max = -1;
        int secondMax =-1;
        for(int i =0;i< digit.length;i++){
            if(digit[i]>max){
                secondMax =max;
                max =digit[i];
            } else if (digit[i]>secondMax && digit[i]<max) {
                secondMax = digit[i];

            }
        }
        System.out.println("largest is "+max);
        System.out.println("second largest "+secondMax);
    }
    public static int sum(int[]digit){
        int sum = 0;
        for(int i=0;i<counter;i++){
               sum+=digit[i];
        }
        return sum;
    }
    public static int[] reverse(int[]digit){
        int[]reverse = new  int[digit.length];
        int cnt = 0;
        for(int i=counter-1;i>=0;i--){
            reverse[cnt]=digit[i];
            cnt++;
        }
        return reverse;
    }
    public static boolean isArmstrong(int[]digit,int number) {
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += Math.pow(digit[i], 3);
        }
        if (sum == number) {
            return true;
        }
        return false;



    }
    public static double sumOfSquares(int[]digit) {
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += Math.pow(digit[i], 2);
        }
        return sum;
    }
    public static boolean isHarshad(int[]digit,int number) {
        double sum = 0;
        for (int i = 0; i < counter; i++) {
            sum += digit[i];
        }
        if (number % sum == 0) {
            return true;
        }
        return false;
    }
    public static int[][] frequencyOfDigit(int[]digit){
        int[][] frequencyArray = new int[2][9];
        for(int j=0;j<10;j++){
            frequencyArray[j][0]=j;
        }
        for(int i=0;i<counter;i++){
            int num = digit[i];
            frequencyArray[num][1]++;

        }
        return frequencyArray;
    }
    public static boolean isEqual(int[]arr1,int[]arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }

        }
        return true;
    }
    public static boolean isPalindrome(int[]digit){
        int i =0;
        int j = counter-1;
        while(i<j){
            if(digit[i]!=digit[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static boolean isPrime(int num){
        boolean isprime = true;
        for(int i=2;i<num;i++){
            if(num% i ==0){
                isprime = false;
                break;
            }

        }
        return isprime;
    }
    public static boolean isNeon(int num){
        double square = Math.pow(num,2);
        int sum =0;
        while(square!=0){
            sum+=square%10;
              square=square/10;
        }
        if(sum==num){
            return true;
        }
        return false;
    }
    public static boolean isSpy(int num){
        int sum =0;
        int produuct = 1;
        while(num!=0) {
            sum += num % 10;

            produuct *= num % 10;
            num = num / 10;
        }
        if(sum == produuct){
            return true;
        }
        return false;

    }

}

