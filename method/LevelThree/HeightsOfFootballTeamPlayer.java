package com.method.LevelThree;

import java.util.Scanner;

public class HeightsOfFootballTeamPlayer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] heights = new int[11];
        for (int i = 0; i < 11; i++) {

            heights[i] = in.nextInt();
            if (heights[i] < 150 && heights[i] > 250) {
                System.out.println("invalid height");
            }
        }
        System.out.println(sum(heights));
        System.out.println(meanHeight(heights));
        System.out.println(shortest(heights));
        System.out.println(tallest(heights));
    }

    public static int sum(int[] heights) {
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];

        }
        return sum;
    }

    public static double meanHeight(int[] heights) {
        int sum = 0;
        double meanheight = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
            meanheight = (double) sum / heights.length;
        }
        return meanheight;
    }
    public static int shortest(int[]heights){
        int shortest =250;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]<shortest){
                shortest = heights[i];
            }
        }
        return shortest;
    }
    public static int tallest(int[]heights){
        int tallest = 150;
        for (int i = 0; i < heights.length; i++) {
            if(heights[i]>tallest){
                tallest = heights[i];
            }
        }
        return tallest;
    }
}