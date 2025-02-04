package com.method.LevelTwo;

import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]age = new int [10];
        for(int i=0;i<10;i++){
            age[i]=in.nextInt();
            System.out.println(voteChecker(age[i]));
        }
    }
    public static boolean voteChecker(int age){
        if(age<0){
            return false;
        }else if(age>=18){
            return true;
        }
        return false;
    }

}
