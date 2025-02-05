package LevelThree;

public class FrequencyInArray {
    public static void main(String[] args) {


        int[][] frequency = new int[256][2];
        String text = "kainkaAgrawal";
        for (int i = 0; i < text.length(); i++) {
          char ch = text.charAt(i);
          frequency[ch][1]++;
          frequency[ch][0]=ch;

        }
        for(int i=0;i<256;i++){
            System.out.print((char)frequency[i][0]);
            System.out.println(frequency[i][1]);
        }
    }
}