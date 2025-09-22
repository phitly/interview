package basic_oop;


///here we are extending index class with ex2 class that we made this is call INHERITENCE 
    ///so whatever we have on ex2 class are here to use 

public class index extends ex2{
    String name;    // varible

    /// method overloading
    /// Key concepts 
        /// these methods have the same method name (sayName) but both are takin in different parameters
        /// java determines which method to call based on arguments you provide
        /// this is called ploymorphism
            ///Behavior:
                /// First method: Generic message "my name!"
                /// Second method: Personalized message using the parameter 
    public void sayName(){
        System.out.println("my name!");
    };

    public void sayName(String name){
        System.out.println("my name is " + this.name);       //This is exactly where this.name becomes important - to distinguish between the instance variable and the parameter when they have the same name!
    };


    /// this is overriding the method from ex2 class that we are currently extending to 
    /// this is printing nothing, to where if we werent overdding it will print whatever sayHi say in ex2 class
    public void sayHi(){    // this is call a subclass of the superclass ex2 

    }
    
    public static void main(String[] args){

        /// this is an example of exteding the ex2 class 
        /// we created a instance object of index then use it to run the sayHi function in ex2 class
        index ex2  =new index();
        ex2.sayHi();

    }
}

// classes are blueprint of making objects,. this object is sayName that has a function that say your name