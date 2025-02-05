package LevelThree;

public class NonRepeatingCharacter {
    public static void main(String[] args) {
        String text ="KainkaAgrawal";
        NonRepeatingCharacter(text);

    }
    public static void NonRepeatingCharacter(String text){
        String[] uniqueCharacter = new String[text.length()];


        for(int i=0;i<text.length();i++){
            boolean isUnique =true;
            char currentChar = text.charAt(i);
            for(int j=0;j<text.length();j++){
                if(text.charAt(i)==text.charAt(j) && i!=j){
                    isUnique=false;
                    break;
                }
            }
            if(isUnique){
                System.out.println(currentChar+"");
            }

        }


    }
}

