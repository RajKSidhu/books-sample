package com.rajdeep.demo.library.controller;

import com.rajdeep.demo.library.model.Book;
import com.rajdeep.demo.library.service.BookService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class BookControllerTest {

    @InjectMocks
    private BookController bookController;

    @MockBean
    private BookService bookService;

    @MockBean
    private Book book;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllBooks(){
        List<Book> listBook = new ArrayList<Book>();
        Mockito.when(bookService.getAllBooks()).thenReturn(listBook);
        Assert.assertNotNull(listBook);
    }

    @Test
    public void testGetBook() {
        bookService.getBook(book.getId());
    }

    @Test
    public void testAddBook(){
        bookService.addBook(book);
    }

    @Test
    public void testUpdateBook(){
        int bookId = 1;
        bookService.updateBook(bookId, book);
    }

    @Test
    public void testDeleteBook(){
        int bookId = 1;
        bookService.deleteBook(bookId);
    }
}
