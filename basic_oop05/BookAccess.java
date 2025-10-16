package basic_oop05;
public class BookAccess {
    public static void main(String s[]) throws CloneNotSupportedException {

        // we can see that book1 is created using the overloaded constructor 
        Book book1 = new Book("Atomic Habits", "James Clear", 30.00f);
        // book2 is created using the default constructor and then the values are set using the setter methods
        Book book2 = new Book();
        book2.setTitle("Sapiens");
        book2.setAuthor("Yuval Noah Harari");
        book2.setPrice(25.00f);

        System.out.println("The first book object is ");
        System.out.println(book1);
        System.out.println("The second book object is ");
        System.out.println(book2);

        Book book3 = (Book)(book1.clone());
        System.out.println("The third book cloned object is ");
        System.out.println(book3);

    }
}