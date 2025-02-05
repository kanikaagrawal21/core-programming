package LevelOne;

public class UpperToLowerASCII {
    public static void main(String[] args) {
        String upperCaseStr = "HELLO WORLD!";
        String lowerCaseStr = convertToLowerCase(upperCaseStr);
        System.out.println("Lowercase: " + lowerCaseStr);
    }

    public static String convertToLowerCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {

            if (c >= 65 && c <= 90) {
                result.append((char) (c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}

