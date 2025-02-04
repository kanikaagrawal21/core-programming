package com.method.levelOne;

import java.util.Scanner;

public class MaximumNumberOfHandshake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(HandShake(num));

    }
    public static int HandShake(int num){
        int maxNumberOfHandShake = (num*(num-1))/2;
        return maxNumberOfHandShake;
    }
}
