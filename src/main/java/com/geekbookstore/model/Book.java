package com.geekbookstore.model;

import lombok.Data;

import java.util.Date;

@Data
public class Book {
    int isbn;
    double score;
    String title;
    String image;
    String author;
    String description;
    Date publishDate;
}
