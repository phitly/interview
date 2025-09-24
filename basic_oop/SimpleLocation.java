package basic_oop;

public class SimpleLocation {
    /// member variables: data the objects need to store
    public double latitude;
    public double longitude;


    /// methods: the things classes can do 
        /// right below is a constructor: method to create a new object 
    public SimpleLocation(double lat, double lon){

        this.latitude=lat;
        this.longitude=lon;
    }

    /// atl.distance(lima)
    /// the lima object is being passed in as arg to the function thats gonna be stored in 
    /// the parameter (other)
        /// but what happend to ucsd how do we get the lat and lon of it? by using this. 
    public double distance(SimpleLocation other){
        return getDist (this.latitude, this.longitude,
                        other.latitude, other.longitude);
                        /// this is the calling object (atl)
                        /// which is the object that called the method (distance)
                        /// so this refers to the location of atl

    }

    // Haversine formula to calculate distance between two points on the Earth
    private double getDist(double lat1, double lon1, double lat2, double lon2) {
        final int R = 6371; // Radius of the earth in km
        double latDistance = Math.toRadians(lat2 - lat1);
        double lonDistance = Math.toRadians(lon2 - lon1);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;
        return distance;
    }
}