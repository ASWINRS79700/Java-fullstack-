package in.stackroute.ust.library;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        books = new LinkedList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("Book with title '" + title + "' not found");
    }

    public void printBooks() {
        print(this.books);
    }

    private void print(List<Book> books){
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void printBooks(SortOrder sortOrder) {
        Comparator<Book> comparator = null;
        if (sortOrder == SortOrder.TITLE) {
            // sort by title
            comparator = new TitleComparator();
            books.sort(comparator);
        }else if (sortOrder == SortOrder.AUTHOR) {
            // sort by author
            comparator = new AuthorComparator();
            books.sort(comparator);
        }
        print(this.books);
    }

    // Inner class
    class TitleComparator implements Comparator<Book>{
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }

    class AuthorComparator implements Comparator<Book>{
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }
}
