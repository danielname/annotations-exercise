/**
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings
public class Author extends Person {
    private List books;

    public Author(String firstName, String lastName) {
        super(firstName, lastName);
        books = new ArrayList();
    }

    /**
     * @deprecated Use publishedBooks instead
     */
    @SuppressWarnings
    public List<String> getBooks() {
        return publishedBooks();
    }

    public List<String> publishedBooks() {
        return books;
    }

    public void addBook(String book) {
        books.add(book);
    }

    @SuppressWarnings
    public String sortName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
