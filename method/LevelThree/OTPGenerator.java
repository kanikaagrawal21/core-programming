package com.method.LevelThree;

public class OTPGenerator {
    public static void main(String[] args) {
        double[]array = arrayOfOTP();
        System.out.println(isUnique(array));

    }
    public static double OTP(){
        return Math.random() * Math.pow(10,6);
    }
    public static double[] arrayOfOTP(){
        double[] array = new double[10];
        for(int i =0;i<array.length;i++){
            array[i]=OTP();
        }
        return array;
    }
    public static boolean isUnique(double[]array){
        for(int i=0;i< array.length;i++){
            for(int j =i+1;j< array.length;j++){
                if(array[i]==array[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
