package testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(String firstname, String lastname, String peselId) {
        LibraryUser libraryUser = new LibraryUser("Pawel","Kon","88090200000");
        List<Book> bookList = new ArrayList<>();
        Book book = new Book("The book title", "The book author", 2000);
        bookList.add(book);

        // temporary returning list of one book
        return bookList;
    }
}
