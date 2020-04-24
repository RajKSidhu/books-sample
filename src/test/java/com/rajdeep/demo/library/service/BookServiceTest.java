package com.rajdeep.demo.library.service;

import com.rajdeep.demo.library.model.Book;
import com.rajdeep.demo.library.repository.BookRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
public class BookServiceTest{

    @InjectMocks
    private BookService bookService;

    @MockBean
    private BookRepository bookRepository;

    @Mock
    private Book book;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
     }

    @Test
    public void testGetAllBooks(){
        List<Book> books = new ArrayList<Book>();
        Mockito.when(bookRepository.findAll()).thenReturn(books);
    }

    @Test
    public void testGetBook() {
        bookRepository.findById(book.getId());
        Assert.assertNotNull(book.getId());
    }

    @Test
    public void testAddBook(){
        bookRepository.save(book);
    }

    @Test
    public void testUpdateBook(){
        bookRepository.save(book);
    }

    @Test
    public void testDeleteBook(){
        Long id = 10000L;
        bookRepository.deleteById(id);
        Assert.assertNotNull(id);
    }
}
