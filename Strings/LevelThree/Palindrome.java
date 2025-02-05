package LevelThree;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
      String text = "naman";
        System.out.println(isPalindrome(text));
    }
    public static boolean isPalindrome(String text){
        int start =0;
        int end = text.length()-1;
        boolean isPalindrom = true;
        while(start<end){
            if(text.charAt(start)!=text.charAt(end)) {
                isPalindrom = false;
                break;
            }
            start++;
            end--;
        }
        return isPalindrom;
    }
    public static void isPalindromeUsingArray(String text){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        char[] charArray = input.toCharArray();
        int length = charArray.length;
        boolean isPalindrome = true;

        for (int i = 0; i < length / 2; i++) {
            if (charArray[i] != charArray[length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
