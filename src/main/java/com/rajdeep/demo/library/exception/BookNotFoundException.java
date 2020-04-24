package com.rajdeep.demo.library.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class BookNotFoundException extends RuntimeException{

    private Long book_id;
    public BookNotFoundException(Long book_id) {
        super(String.format("Book is not found with id : '%s'", book_id));
    }
}
