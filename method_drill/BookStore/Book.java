package method_drill.BookStore;
import java.util.HashMap;
import java.util.Map;


class Book {
    private String id;
    private String title;
    private int stock;

    public Book(String id, String title, int stock) {
        this.id = id;
        this.title = title;
        this.stock = stock;
    }

    public String getId() { return id; }
    public int getStock() { return stock; }

    public void restock(int amount) {
         /* TODO */ 
        if (amount > 0){
            stock+=amount;
        }
    }
    public boolean purchase() { /* TODO */ }
}
class BookStore {
    private Map<String, Book> shelf = new HashMap<>();

    public void addBook(Book b) { /* TODO */ }
    public Book getBook(String id) { /* TODO */ }
    public boolean restockBook(String id, int amount) { /* TODO */ }
    public boolean buyBook(String id) { /* TODO */ }
    public boolean removeBook(String id) { /* TODO */ }
}