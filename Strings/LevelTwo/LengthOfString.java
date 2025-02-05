package LevelTwo;

public class LengthOfString {
    public static void main(String[] args) {
        String text = "kanikaAgrawal";
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
}
