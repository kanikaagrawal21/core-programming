package com.method.LevelThree;

import java.util.Arrays;
import java.util.Scanner;

public class ZaraSalary {

    public static void main(String[] args) {
        double[][] data = dataOfEmp();
        double[][] bonuses = calculateBonus(data);
        display(data, bonuses);
    }

    public static double[][] dataOfEmp() {
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][1] = Math.random() * 10;
            data[i][0] = Math.random() * Math.pow(10, 4);
        }
        return data;
    }

    public static double[][] calculateBonus(double[][] data) {
        double[][] arr = new double[10][2];

        for (int i = 0; i < 10; i++) {
            if (data[i][1] > 5) {
                double bouns = data[i][0] * 0.05;
                arr[i][1] = bouns;
                arr[i][0] = data[i][0] + bouns;
            } else {
                double bouns = data[i][0] * 0.02;
                arr[i][1] = bouns;
                arr[i][0] = data[i][0] + bouns;
            }
        }

        return arr;
    }
    public static void display(double[][] data, double[][] bonuses) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            totalOldSalary += data[i][0];
            totalNewSalary += bonuses[i][0];
            totalBonus += bonuses[i][1];
        }

        System.out.println("Old Salary -->" + totalOldSalary);
        System.out.println("New Salary -->" + totalNewSalary);
        System.out.println("Total bonus -->" + totalBonus);
    }
    }


