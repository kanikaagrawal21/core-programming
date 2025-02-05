package LevelTwo;

public class VowelAndConsonent {
    public static void main(String[] args) {
        String text = "kanika";
        String[][] str = new String[text.length()][2];
        int vowelCount =0;
        int ConsonentCount=0;
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)<=97 && text.charAt(i)>=122){
                System.out.println("not a char");
                str[i][0]=""+text.charAt(i);
                str [i][1]="NotAlphabet";
            }
           else if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'){
                vowelCount++;
                str[i][0]=""+text.charAt(i);
                str [i][1]="Vowel";
            }else{
                ConsonentCount++;
                System.out.println("consonent");
                str[i][0]=""+text.charAt(i);
                str [i][1]="consonent";
            }

        }
        System.out.println(vowelCount);
        System.out.println(ConsonentCount);
    }
}
