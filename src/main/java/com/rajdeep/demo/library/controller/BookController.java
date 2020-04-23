package com.rajdeep.demo.library.controller;

import com.rajdeep.demo.library.model.Book;
import com.rajdeep.demo.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController{

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    private List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/book/{id}")
    private Book getBook(@PathVariable("id") int bookId){
        return bookService.getBook(bookId);
    }

    @PostMapping("/book")
    private ResponseEntity<Object> addBook(@RequestBody Book book) {
        bookService.addBook(book);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/book/{id}")
    private ResponseEntity<Object> updateBook(@PathVariable("id") int bookId, @RequestBody Book book) {
        bookService.updateBook(bookId, book);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/book/{id}")
    private void deleteBook(@PathVariable("id") int bookId) {
        bookService.deleteBook(bookId);
    }
}
