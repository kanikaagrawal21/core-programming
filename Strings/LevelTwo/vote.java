package LevelTwo;

import java.util.Scanner;

public class vote {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int[]age = new int [10];
            String[][] result = new String[10][2];
            for(int i=0;i<10;i++){
                age[i]=in.nextInt();
                result[i][1]=""+voteChecker(age[i]);
                result[i][0]=""+age[i];

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

