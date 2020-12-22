public class avgSpeed {
    public static void main(String[] args){

        double kilometers = 15.0;
        double miles = kilometers / 1.6;
        double rate = (50.5 * 60.0 + 30.0) / (60.0 *60.0);
        double mph = miles / rate;

        System.out.println("Assume that a runner runs 15 kilometers in 50 minutes and 30 seconds. Write a program that displays the average speed in mph");
        System.out.println("Firstly lets convert 15 kilometers to miles... 15 Kilometers = " + miles + "miles");

        System.out.println("The runners average speed is... " + mph + "mph");

    }
}
