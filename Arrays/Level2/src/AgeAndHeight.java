import java.util.Scanner;

public class AgeAndHeight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int heightAmar = in.nextInt();
        int heightAkbar =in.nextInt();
        int heightAnthony = in.nextInt();
        int ageAmar = in.nextInt();
        int ageAkbar = in.nextInt();
        int ageAnthony = in.nextInt();
        if(ageAmar>ageAnthony && ageAmar >ageAkbar){
            System.out.println("amar is oldest");
        }else if(ageAnthony>ageAmar && ageAnthony >ageAkbar){
            System.out.println("anthony is oldest");
        }else if(ageAkbar>ageAnthony && ageAmar <ageAkbar) {
            System.out.println("akbar is oldest");
        }
        if(heightAnthony>heightAkbar && heightAnthony>heightAmar){
            System.out.println(" tallest is anthony");
        } else if(heightAmar>heightAkbar && heightAmar>heightAnthony){
            System.out.println(" tallest is amar");
        }else if(heightAkbar>heightAmar && heightAkbar>heightAnthony){
            System.out.println(" tallest is akbar");
        }
    }
}
