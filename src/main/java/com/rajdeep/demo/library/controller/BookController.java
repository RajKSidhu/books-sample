package com.rajdeep.demo.library.controller;

import com.rajdeep.demo.library.model.Book;
import com.rajdeep.demo.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public Book getBook(@PathVariable("id") int bookId){
        return bookService.getBook(bookId);
    }

    @PostMapping("/book")
    public int addBook(@RequestBody Book book) {
        bookService.addBook(book);
        ResponseEntity.ok().build();
        return book.getId();
    }

    @PutMapping("/book/{id}")
    public int updateBook(@PathVariable("id") int bookId, @RequestBody Book book) {
        bookService.updateBook(bookId, book);
        ResponseEntity.ok().build();
        return book.getId();
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable("id") int bookId) {
        bookService.deleteBook(bookId);
    }
}
