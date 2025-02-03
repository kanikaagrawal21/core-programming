public class VolumeOfEarth {
    public static void main(String[] args) {
        int radius = 6378;
        double volumeOfEarth = 4/3*22/7*radius*radius*radius;
        double volumeOfEarthInMiles = volumeOfEarth*1.6;
        System.out.println("volume of earth in kilometer is "+ volumeOfEarth+" km^3    volume of earth in miles "+ volumeOfEarthInMiles+" miles^3");
    }
}
