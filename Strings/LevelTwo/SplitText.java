package LevelTwo;

import java.util.Arrays;
import java.util.Scanner;

public class SplitText {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        System.out.println(Arrays.toString(countWord(text)));

    }
    public static String[] countWord(String text){
        int count =1;
        for(int i =0;i<text.length();i++){
            if(text.charAt(i)==' '){
                count++;
            }
        }
        String[]word = new String[count];
        int index =0;
        int start =0;
        int end =0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                end =i;
                word[index]=text.substring(start,end);
                index++;
                start = end+1;
            }
        }
        word[index] = text.substring(start, text.length());
        return word;
    }
}
