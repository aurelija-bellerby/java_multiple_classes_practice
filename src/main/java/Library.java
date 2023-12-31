import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.capacity = capacity;
        this.books = new ArrayList<>();
    }

    public int totalBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        if (capacity > totalBooks()) {
            books.add(book);
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book removeBook(Book book) {
        int index = books.indexOf(book);
        return books.remove(index);
    }
}
