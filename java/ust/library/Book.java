package in.stackroute.ust.library;

public class Book implements Comparable<Book> {
    
    private String title;

    private String author;

    public Book(){}

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", title=" + title + "]";
    }
}
