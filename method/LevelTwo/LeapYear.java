package com.method.LevelTwo;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int year = in.nextInt();
        System.out.println(LeapYear(year));
    }
    public static String LeapYear(int year){
        if (year < 1582) {
            System.out.println("Invalid input! The Gregorian calendar started in 1582.");

        }

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return " is a Leap Year";
                } else {
                    return " is NOT a Leap Year";
                }
            } else {
                return " is a Leap Year";
            }
        } else {
            return " is NOT a Leap Year";
        }
    }
}
