package LevelThree;

public class FrequencyofUniqueCharacter {
    public static void main(String[] args) {

        String text ="kanika";

        String uniqueCharacter = "";
        int[][] frequency = new int[256][2];

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;
            char currentChar = text.charAt(i);
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j) && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharacter+=currentChar;
            }

        }
        for(int i=0;i<uniqueCharacter.length();i++){
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


