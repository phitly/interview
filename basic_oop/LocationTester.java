package basic_oop;

public class LocationTester {
    public static void main(String[] args) {
        /// inside this main function
        /// created 2 new SimpleLocaiton objects
        /// new SimpleLocation is goin over to SimpleLocation to call the SimpleLocation construct
        /// 
        // Real coordinates
        SimpleLocation atl = new SimpleLocation(33.7490, -84.3880);  // Atlanta
        SimpleLocation lima = new SimpleLocation(-12.0464, -77.0428); // Lima, Peru

        System.out.println(atl.distance(lima));
    }

}
