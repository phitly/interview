public class Animal {
    // memeber vars
    private String name;
    private String food;

    public Animal(String name){
        this.name=name;
    }
    public String sound(){
        return null;
    }
    public void setFood(String food){
        this.food=food;
    }
    public String getFood(){
        return this.food;
    }
    public String toString(){
        return name.concat(" say ").concat(sound().concat(" and eat ").concat(food));
    }
}
    //dog class inherits animal class 
    class Dog extends Animal{
        public Dog(String name){    
            super(name);
        }
        public String sound(){  // why is this line infcorrect? explain to me // 
            return "Woooooooof";
        }
    }
    // cat class 
    class Cat extends Animal{
        // constructor
        public Cat(String name){
            super(name);
        }
        // sound method inherits from parent Animal class
        public String sound(){
            return "Meow";
        }
    }

    // cow class
    class Cow extends Animal{
        public Cow (String name){
            super(name);
        }
        public String sound(){
            return "Moo";
        }
    }

//Notice that you can have only one public class in .java file 
//and the name of the file should be the same as the public class. 
//The other classes in the file don't have an access modifier, which means they are using default modifier