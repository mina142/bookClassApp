import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BookApp {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("Kathy Sierra");
        book1.setBookTitle("Head First Java");
        book1.setDescription("2nd Edition Covers Java 5.0");
        book1.setPrice(12.20);
        book1.setInStock(true);


        Book book2 = new Book();
        book2.setAuthor("Barry Burd");
        book2.setBookTitle("Begining Programming with Java");
        book2.setDescription("5th Edition ");
        book2.setPrice(20.00);
        book2.setInStock(false);

        Book book3 = new Book();
        book3.setAuthor("Nathan Clark");
        book3.setBookTitle("programming Basics for Absoulute beginners");
        book3.setDescription("3rd Edition");
        book3.setPrice(17.25);
        book3.setInStock(true);

        Book book4 = new Book();
        book4.setAuthor("Herbert Schildt");
        book4.setBookTitle("Java A Beigginer's guide");
        book4.setDescription("8th Edition ");
        book4.setPrice(14.75);
        book4.setInStock(false);

        Book book5 = new Book();
        book5.setAuthor("Cay S. Horstmann");
        book5.setBookTitle("Core Java Volum I- Fundamentals");
        book5.setDescription("11th Edition ");
        book5.setPrice(22.80);
        book5.setInStock(true);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        sum(books);
    }

    public static void sum(ArrayList<Book> books ) {
        double sum = 0.0;
        System.out.println("How many books do you need? ");

        int customerInput = keyboard.nextInt();
        for (Book b : books) {
                if (b.inStock()) {
                    sum = sum + b.getPrice();

//                } else {
//                    System.out.println(b.getBookTitle() + " is not availbale at this time!!");
                }
        }System.out.println(sum);
    }
}