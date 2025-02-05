package LevelOne;

import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.next();
        try{
            convertInteger(text);
        } catch (java.lang.NumberFormatException e){
            System.out.println("wrong number");
        }
    }
    public static int convertInteger(String text){
        int num = Integer.parseInt(text);
        return num;
    }
}
