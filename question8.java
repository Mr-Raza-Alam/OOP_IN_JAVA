public class question8 {
 public static void main(String args[]){
    
    System.out.println(Book.count);//count is acces using its class name only without creating any object
    Book b1 = new Book(150);
    Book b2 = new Book(250);
    System.out.println(Book.count);
   
 }    
}

class Book{
    int price;
    static int count;
    public Book(int price){
        this.price = price;
        count++;
    }
}
