public class Book implements Cloneable {
    private String title;
    private String author;
    private float price;

    // when create an overloading constructor, default constructor is not created automatically
    // so we need to create it manually
    // default constructor will initialize the object but we have to set the values later using setter methods
    public Book() {
        this.title = null;
        this.author = null;
    }

    // takes in 3 parameters to initialize the object
    // the value of each of attributes is set when the object is created
    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Overriding the clone() method..
    // but why do we need to create a clone for this example ? 
        // In this example, the clone() method is overridden to allow the Book class to be cloned. 
        // By implementing the Cloneable interface and overriding the clone() method,
            // we enable the creation of a new Book object that is a copy of an existing Book object.
            // This is particularly useful in scenarios where you want to duplicate a Book object with the same title, author, and price,
            // without having to manually create a new Book object and set each attribute individually.
            // In the provided code, the clone() method is used in the BookAccess class to create a third Book object (book3) 
            // that is a clone of the first Book object (book1). This demonstrates how the clone() method can be used to
            // create a duplicate of an existing object easily.
    @Override
    protected Object clone() throws CloneNotSupportedException {    // what is CloneNotSupportedException ?
        // explain it simple, it is an exception that is thrown when the clone() method is called on an object that does not implement the Cloneable interface
        return super.clone();
    }
    //void means it does not return any value
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    // toString method? what is it. it is used to return a string representation of the object
        // when we print the object, it will call the toString method
        // if we do not override the toString method, it will return the memory address of the object
        // so we override it to return the values of the attributes of the object
    @Override
    public String toString() {
        return "Title - " + this.title + "\nAuthor - "
            + this.author + "\nPrice - "+ String.format("%.2f", this.price);
    }
}