package LevelOne;

import org.w3c.dom.Text;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your text");
        String text = in.next();
        System.out.println("enter starting index or your substring ");
        int start = in.nextInt();
        System.out.println("enter ending index of your substring");
        int end = in.nextInt();
        System.out.println(text.substring(2,4));
        System.out.println(CreatingSubstring(text,start,end ));


    }
     public static String CreatingSubstring(String text,int start,int end){
        String newText = new String();
        for(int i= start;i<end;i++){
            newText += text.charAt(i);
        }
        return newText;
     }
    public static void compare (String text,String newText){
        System.out.println(text.equals(newText));
    }
}
