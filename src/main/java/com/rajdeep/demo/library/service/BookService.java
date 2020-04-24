package com.rajdeep.demo.library.service;

import com.rajdeep.demo.library.exception.BookNotFoundException;
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
     * @param id id
     */
    public Book getBook(Long id) throws BookNotFoundException{
        return bookRepository.findById(id).orElseThrow(()-> new BookNotFoundException(id));
    }

    /**
     * Method to add the book
     * @param book book
     */
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    /**
     * Method to update the book information based on id
     * @param id id
     * @param bookDetail bookDetails
     */
    public Book updateBook(Long id, Book bookDetail) throws BookNotFoundException{
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));

        book.setTitle(bookDetail.getTitle());
        book.setAuthor(bookDetail.getAuthor());
        book.setType(bookDetail.getType());
        book.setPrice(bookDetail.getPrice());
        book.setNumOfPages(bookDetail.getNumOfPages());
        book.setLanguage(bookDetail.getLanguage());

        Book updatedBook = bookRepository.save(book);

        return updatedBook;
    }

    /**
     * Method to delete the book record based on id
     * @param id id
     */
    public void deleteBook(Long id) throws BookNotFoundException{

        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));

        bookRepository.delete(book);
    }
}
