public class SimpleLocation {
    private double latitude;
    public double longitude;

    /// public accessible everywhere
    /// private accesible only inside the class

    /// solution to priviate variables block outside access?
        /// getters and setters
        /// getter returns the value of private variable
        /// setter assigns a new value to a priviate variable w optional validation logic
    
    /// Reason not to make variables public: 
    ///     GETTERS AND SETTERS allow CONTROL
    ///     - validation, restricted changes, immutability option and debuggin hooks  
public double getLatitude() {
    return latitude;
}

public void setLatitude(double lat) {
    if (lat < -180 || lat > 180) {
        System.out.println("Illegal latitude value");
    } else {
        latitude = lat;
    }
}
}


/// ENCAPSULATION: bundling data (fields) and behavior (methods) inside a class
/// while restricting direct access to the data.
    /// getters and setters are the mechanism that makes encapsulation work 
    /// 	•	Getter: lets outside code read a private field without directly accessing it.
	///     • 	Setter: lets outside code change a private field, but with rules or checks. 