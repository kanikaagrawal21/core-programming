package LevelThree;

public class UniqueCharacter {
    public static void main(String[] args) {
        String text = "kanikaAgrawal";
        lengthOfString(text);
        uniqueCharacter(text);


    }
    public static void lengthOfString(String text){

        int length = 0;
        try {
            while (true) {
                char ch = text.charAt(length);
                length++;

            }
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println(length);
        }

    }
    public static void uniqueCharacter(String text){
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
        System.out.println(uniqueCharacter);

    }
}

