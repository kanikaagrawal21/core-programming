package LevelTwo;

import java.util.Arrays;
import java.util.Scanner;

public class SplitTextAndWordLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        String[][] word = countWord(text);
        for (int i=0; i<word.length; i++) {
            System.out.println(Arrays.toString(word[i]));
        }

    }
    public static String[][] countWord(String text){
        int count =1;
        for(int i =0;i<text.length();i++){
            if(text.charAt(i)==' '){
                count++;
            }
        }
        String[][]word = new String[count][2];
        int index =0;
        int start =0;
        int end =0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)==' '){
                end =i;
                word[index][0]=text.substring(start,end);
                word[index][1] = ""+(end-start);
                index++;
                start = end+1;
            }
        }
        word[index][0] = text.substring(start, text.length());
        word[index][1] = ""+(text.length()-start);
        return word;
    }
}
