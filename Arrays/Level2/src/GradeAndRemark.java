import java.util.Scanner;

public class GradeAndRemark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int math = in.nextInt();
        int Physics = in.nextInt();
        int chemistry = in.nextInt();
        int totalMarks = math + Physics + chemistry;
        int percentage = totalMarks / 300 * 100;
        if (percentage >= 80) {
            System.out.println("average marks " + percentage + " Grade A   Remarks: level4,above agency-normalize standards");

        } else if (percentage >= 70 && percentage <= 79) {
            System.out.println("average marks " + percentage + " Grade B   Remarks: level3,at agency-normalize standards");

        } else if (percentage >= 60 && percentage <= 69) {
            System.out.println("average marks " + percentage + " Grade c   Remarks: level4, below agency-normalize standards");


        } else if (percentage >= 50 && percentage <= 59) {
            System.out.println("average marks " + percentage + " Grade d   Remarks: level5,well below agency-normalize standards");

        } else if (percentage >= 40 && percentage <= 49) {
            System.out.println("average marks " + percentage + " Grade e   Remarks: level4,too below agency-normalize standards");

        } else if (percentage <= 39) {
            System.out.println("average marks " + percentage + " Grade f   Remarks: Remedial");

        }
    }
}
