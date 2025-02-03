import java.util.*;
public class AveragePercentMarks {
    public static void main(String[] args) {


        int math = 94;
        int physics = 95;
        int chemistry = 96;
        int totalMarksObtain = math+chemistry+physics;

        double averagePercentMark = (double)totalMarksObtain/300*100;
        System.out.println("average mark in PCM is "+ averagePercentMark+"%");

    }
}
