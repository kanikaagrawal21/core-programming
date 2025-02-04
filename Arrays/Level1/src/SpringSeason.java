import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter date");
        int day = in.nextInt();
        System.out.println("enter month");
        int month = in.nextInt();
        if(month==3 && day>=20){
            System.out.println("Spring Season");
        } else if (month == 4 && month==5) {
            System.out.println("Spring Season");

        } else if (month<=6 && day<=20) {
          System.out.println("Spring season");

        }else{
            System.out.println("Not a Spring Season");
        }
    }
}
