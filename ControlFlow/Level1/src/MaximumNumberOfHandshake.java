import java.util.Scanner;

public class MaximumNumberOfHandshake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no. of students: ");
        int n = in.nextInt();

        int handshakes = (n*(n-1))/2;

        System.out.println("The max possible handshakes between " + n + " students are " + handshakes);
    }
}
