package com.dgc.library.model;

import java.util.List;

public class Book {
    private final String title;
    private final List<String> authors;
    private final String fakeISBN;

    public Book(String t, List<String> authors, String isbn) {
        this.title = t;
        this.authors = authors;
        this.fakeISBN = isbn;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getFakeISBN() {
        return fakeISBN;
    }
}
