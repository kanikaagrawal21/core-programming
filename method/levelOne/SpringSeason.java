package com.method.levelOne;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day =  in.nextInt();
        int month = in.nextInt();
        System.out.println(SpringSeason(day,month));

    }
    public static String SpringSeason(int day,int month){
        if(month==3 && day>=20){
            return "Spring Season";
        } else if (month == 4 && month==5) {
            return "Spring Season";

        } else if (month<=6 && day<=20) {
            return "Spring season";

        }else{
            return "Not a Spring Season";
        }

    }
}
