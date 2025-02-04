package com.method.LevelThree;

import java.util.Scanner;

public class CollinearPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int y1 = in.nextInt();
        int y2 = in.nextInt();
        int x3 = in.nextInt();
        int y3 = in.nextInt();
        System.out.println(isCollinearBySlope(x1,x2,x3,y1,y2,y3));
        System.out.println(isCollinearByArea(x1,x2,x3,y1,y2,y3));
    }
    public static boolean isCollinearBySlope(int x1,int x2,int x3,int y1,int y2,int y3){
        double ab,bc,ac;
        ab=(y2 - y1)/(x2 - x1);
        bc= (y3 - y2)/(x3 - x3);
        ac=(y3 - y1)/(x3 - x1);
        if(ab==bc && ab==ac){
            return true;
        }
        return false;
    }
    public static boolean isCollinearByArea(int x1,int x2,int x3,int y1,int y2,int y3){
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        if(area ==0) return true;
        return false;
    }

    }
