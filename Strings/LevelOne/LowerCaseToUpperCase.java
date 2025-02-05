package LevelOne;

public class LowerCaseToUpperCase {
    public class UpperToLowerASCII {
        public static void main(String[] args) {
            String upperCaseStr = "HELLO WORLD!";
            String lowerCaseStr = convertToLowerCase(upperCaseStr);
            System.out.println("Lowercase: " + lowerCaseStr);
        }

        public static String convertToLowerCase(String str) {
            StringBuilder result = new StringBuilder();

            for (char c : str.toCharArray()) {

                if (c >= 'A' && c <= 'Z') {
                    result.append((char) (c + 32));
                } else {
                    result.append(c);
                }
            }
            return result.toString();
        }
    }
}