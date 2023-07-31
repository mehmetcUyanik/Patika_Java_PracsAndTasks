package Tasks.KitapSiralayici;

import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Book C", 250, "Author C", new Date(1900));
        Book book2 = new Book("Book A", 180, "Author A", new Date(1901));
        Book book3 = new Book("Book B", 320, "Author B", new Date(1902));
        Book book4 = new Book("Book E", 400, "Author D", new Date(1903));
        Book book5 = new Book("Book D", 300, "Author E", new Date(1904));

        Set<Book> bookSetByName = new TreeSet<>();
        bookSetByName.add(book1);
        bookSetByName.add(book2);
        bookSetByName.add(book3);
        bookSetByName.add(book4);
        bookSetByName.add(book5);

        System.out.println("Books sorted by name (A to Z):");
        for (Book book : bookSetByName) {
            System.out.println(book);
        }

        Set<Book> bookSetByPageCount = new TreeSet<>(Comparator.comparingInt(Book::getPageCount));
        bookSetByPageCount.add(book1);
        bookSetByPageCount.add(book2);
        bookSetByPageCount.add(book3);
        bookSetByPageCount.add(book4);
        bookSetByPageCount.add(book5);

        System.out.println("\nBooks sorted by page count:");
        for (Book book : bookSetByPageCount) {
            System.out.println(book);
        }
    }
}
