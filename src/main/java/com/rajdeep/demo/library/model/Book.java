package com.rajdeep.demo.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Data
@Entity
public class Book {

    @Id
   private int id;

    private String title;
    private String author;
    private String type;
    private double price;
    private int numOfPages;
    private String language;
}
