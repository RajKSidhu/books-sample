package com.rajdeep.demo.library.controller;

import com.rajdeep.demo.library.exception.BookNotFoundException;
import com.rajdeep.demo.library.model.Book;
import com.rajdeep.demo.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/library")
public class BookController{

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") Long bookId) throws BookNotFoundException{
        return bookService.getBook(bookId);
    }

    @PostMapping("/book")
    public Book addBook(@Valid @RequestBody Book book) {
        return bookService.addBook(book);
    }

    @PutMapping("/book/{id}")
    public Book updateBook(@PathVariable("id") Long bookId, @Valid @RequestBody Book book) throws BookNotFoundException{
        return bookService.updateBook(bookId, book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable("id") Long bookId) throws BookNotFoundException {
        bookService.deleteBook(bookId);
    }
}
