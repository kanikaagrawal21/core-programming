package com.method.LevelTwo;

import java.util.Arrays;

public class MinMaxRandom {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i=0; i<5; i++) {
            nums[i] = (int)random(4);
        }
        System.out.println(Arrays.toString(nums));
        MinMaxAverage(nums);

    }
    public static void MinMaxAverage(int[] nums){
        int min=nums[0],max=nums[0],avg=nums[0];
        for(int i =1;i<nums.length;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
            avg += nums[i];
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg/5);
    }
    public static double random(int size){
        return Math.random()*Math.pow(10, size);
    }

}


