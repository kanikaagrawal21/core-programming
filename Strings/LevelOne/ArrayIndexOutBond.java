package LevelOne;

import java.util.Scanner;

public class ArrayIndexOutBond {
    public static void main(String[] args) {
        int[] array = new int[3];
        try{
            System.out.println(array[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("wrong index");

        }
    }
}
