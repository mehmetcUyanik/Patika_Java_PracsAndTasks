package Tasks.KitapSiralayici;

import java.util.*;

public class Book implements Comparable<Book> {

    private String name;
    private int pageCount;
    private String author;
    private Date publicationDate;

    public Book(String name, int pageCount, String author, Date publicationDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    @Override
    public int compareTo(Book other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " by " + author + " (" + pageCount + " pages)";
    }

}
