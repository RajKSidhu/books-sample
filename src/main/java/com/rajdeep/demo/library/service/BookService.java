package com.rajdeep.demo.library.service;

import com.rajdeep.demo.library.model.Book;
import com.rajdeep.demo.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    /**
     * Method to fetch all the books
     * @return books
     */
    public List<Book> getAllBooks() {
        List<Book> books = new ArrayList<Book>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    /**
     * Method to fetch the book based on id
     * @param id
     * @return
     */
    public Book getBook(int id) {
        return bookRepository.findById(id).orElseGet(Book::new);
    }

    /**
     * Method to add the book
     * @param book
     */
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    /**
     * Method to update the book information based on id
     * @param id
     * @param book
     */
    public void updateBook(int id, Book book) {
        bookRepository.save(book);
    }

    /**
     * Method to delete the book record based on id
     * @param id
     */
    public void deleteBook(int id) {
        bookRepository.deleteById(id);
    }
}
