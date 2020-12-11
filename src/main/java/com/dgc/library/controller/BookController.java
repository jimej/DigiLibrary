package com.dgc.library.controller;

import com.dgc.library.model.Book;
import com.dgc.library.model.Library;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public List<Book> listAllBooks() {
        return List.copyOf(Library.ALLBOOKS.values());
    }

    @GetMapping("/mappedToIds")
    public Map<UUID, Book> listAllBooksWithIds() {
        return Library.ALLBOOKS;
    }

    @PostMapping
    public UUID addBook(@RequestBody Book book) {
        UUID id = UUID.randomUUID();
        Library.ALLBOOKS.put(id, book);
        return id;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable UUID id) {
        return Library.ALLBOOKS.get(id);
    }

    @DeleteMapping("/{id}")
    public Book removeBook(@PathVariable UUID id) {
        Book book = Library.ALLBOOKS.remove(id);
        return book;
    }

    @PutMapping("/{id}")
    public Book updateBook(@RequestBody Book book, @PathVariable UUID id) {
        Library.ALLBOOKS.put(id, book);
        return book;
    }

    @PatchMapping("/{id}")
    public Book updateAuthors(@PathVariable UUID id, @RequestBody Map<String, Object> updates) {
       Book book = Library.ALLBOOKS.get(id);
       //simulate partial update using immutable Book
       Book updated = new Book(book.getTitle(), (List<String>)updates.get("authors"), book.getFakeISBN());
       Library.ALLBOOKS.put(id, updated);
       return updated;
    }

}
