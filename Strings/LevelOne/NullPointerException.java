package LevelOne;

public class NullPointerException {
    public static void main(String[] args) {
        genrateException();

    }
    public static void genrateException() {
        String text ="igytdersdfy";
        try{
            int len = text.length();
            char c = text.charAt(2);
            String subText = text.substring(2);

        } catch (java.lang.NullPointerException e) {
            System.out.println("Null Error: "+ e.getMessage());
        }
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index error");
        }
        catch (IllegalArgumentException e) {
            System.out.println("wrong argument");
        }
        System.out.println("asdfgh");
    }
}
