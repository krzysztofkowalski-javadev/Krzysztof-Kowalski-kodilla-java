package com.kodilla.stream.book;

import org.junit.jupiter.api.Test;

import java.util.List;

public class BookTestSuite {

    @Test
    void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books=bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007=0;
        /*for (Book book :books) {
            if (book.getYearOfPublication())
        }*/
    }
}
