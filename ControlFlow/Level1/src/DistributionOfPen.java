public class DistributionOfPen {
    public static void main(String[] args) {
      int numOfPen = 14;
      int numOfStudent = 3;
      int penWithEachStudent = numOfPen/numOfStudent;
      int penNotDistributed = numOfPen%numOfStudent;
      System.out.println("num of with each student  "+ penWithEachStudent +"  number of pen whuch are not distributed  " +penNotDistributed);
    }
}
