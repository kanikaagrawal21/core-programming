package LevelOne;

import java.util.Scanner;

public class CharectersOfString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your text");
        String text = in.next();
        getCharacters(text);

    }
    public static void getCharacters(String text){
        char[] charArray = new char[text.length()];
        for(int i=0;i<text.length();i++){
            charArray[i]=text.charAt(i);
            System.out.println(charArray[i]+"");
        }

    }
}
