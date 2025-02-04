package com.method.levelOne;

import java.util.Arrays;
import java.util.Scanner;

public class RemainderAndQuotient {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(Arrays.toString(RemainderAndQuotient(num1,num2)));

    }
    public static int[] RemainderAndQuotient(int num1,int num2){
        int quotient = num1/num2;
        int remainder = num1%num2;

        int[]ans = new int[2];
        ans[0]=quotient;
        ans[1]=remainder;
        return ans;
    }
}
