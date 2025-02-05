package LevelOne;

import java.util.Scanner;

public class StringAreEqualOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter string one");
        String string1 = in.nextLine();
        System.out.println("enter string two");
        String string2 = in.nextLine();
        System.out.println(isEqual(string1,string2));
       isEqualByInbuiltFunction(string1,string2);

    }
    public static boolean isEqual(String string1,String string2){
        for(int i=0;i<string1.length();i++){

                if(string1.charAt(i)!=string2.charAt(i)){
                    return false;

            }
        }
        return true;

    }
    public static void isEqualByInbuiltFunction(String string1,String string2){
        System.out.println(string1.equals(string2));
    }
}
