package LevelThree;

import java.util.Arrays;
import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] teamData = new int[10][3];
        for(int i =0;i< teamData.length;i++) {
            teamData[i][0] = in.nextInt();
            teamData[i][1] = in.nextInt();
        }

        System.out.println(Arrays.toString(bmiCalculator(teamData)));

    }
    public static String[] bmiCalculator(int[][] teamData){


        String[] result = new String[teamData.length];
        for(int i =0;i< teamData.length;i++){

            double bmi = (teamData[i][1]*10000)/(teamData[i][0]*teamData[i][0]);

            teamData[i][2]=(int)bmi;
            if(bmi<=18.4){
                result[i]="underweight";
            } else if (bmi>=18.5 && bmi<=24.9) {
                result[i]="Normal";

            } else if (bmi>=25.0&& bmi<=39.9) {
                result[i]="overweight";
            } else if (bmi>=40.0) {
                result[i]="obese";
            }
        }
        return result;

    }
}

