public class BookApp {

    public static void main(String[] args){
        Book book1 = new Book();
        book1.setAuthor("Kathy Sierra");
        book1.setBookTitle("HEad First Java");
        book1.setDescription("2nd Edition Covers Java 5.0");
        book1.setPrice(12.20);
        book1.setInStock("yes");

        book1.getDisplayText();

    }
}
