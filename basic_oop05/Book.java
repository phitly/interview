package basic_oop05;

public class Book{
    // variables 
    String author;
    String title;
    int year;
    float price;

    // setters for book info
    public void setAuthor(String author){
        this.author=author;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setPrice(float price){
        this.price=price;
    }

    // getters to get the info 
    public String getAuthor() {
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public int getYear(){
        return this.year;
    }
    public float getPrice(){
        return this.price;
    }
    //method to print book
    public String toString(){
        return "Title "+ this.title + " Author "+ this.author + " year " + this.year + " price: " + this.price;
    }

    //book price compare method
     private static void comparePrices(Book book1, Book book2){ 
        float book1Price = book1.getPrice();
        float book2Price= book2.getPrice();
        String priceCmp=" ";
        if (book1Price > book2Price){
            priceCmp = book1.title + " is more expensive than " + book2.title;
        } else if (book1Price < book2Price) {
            priceCmp = book2.title + " is more expensive than " + book1.title;
        } else {
            priceCmp = book1.title + " and " + book2.title + " have the same price.";
        }
        System.out.println(priceCmp);
    }

    // main method
    public static void main(String[] args) {
        Book book1 =new Book();
        book1.setAuthor("jkrow");
        book1.setTitle("Harry potter");
        book1.setYear(2008);
        book1.setPrice((float)12.95);

        Book book2 =new Book();
        book2.setAuthor("phi ");
        book2.setTitle("1984");
        book2.setYear(2003);
        book2.setPrice((float)19.95);
        System.out.println(book1);
        System.out.println(book2);
        comparePrices(book1, book2);
    }
}