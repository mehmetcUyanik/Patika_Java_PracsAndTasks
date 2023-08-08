package Tasks.KitapListesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 150, "Author1", "2021-01-01"));
        books.add(new Book("Book2", 80, "Author2", "2022-03-15"));
        books.add(new Book("Book3", 50, "Author3", "2022-04-05"));
        books.add(new Book("Book4", 180, "Author4", "2023-01-01"));
        books.add(new Book("Book5", 200, "Author5", "2020-10-11"));
        books.add(new Book("Book6", 65, "Author6", "2019-02-15"));
        books.add(new Book("Book7", 85, "Author7", "2022-09-07"));
        books.add(new Book("Book8", 130, "Author8", "2021-03-15"));
        books.add(new Book("Book9", 150, "Author9", "2021-07-23"));
        books.add(new Book("Book10", 120, "Author10", "2020-08-13"));


        Map<String, String> bookAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getName, Book::getAuthor));

        System.out.println("Book Author Map: " + bookAuthorMap);

        List<Book> booksWithMoreThan100Pages = books.stream()
                .filter(book -> book.getNumPages() > 100)
                .collect(Collectors.toList());

        System.out.println("Names of books with more than 100 pages:");
        booksWithMoreThan100Pages.forEach(book -> System.out.println(book.getName()));
    }
}
