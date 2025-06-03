package com.example.bookhub.service;

import java.util.List;
import com.example.bookhub.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> getAll();
}
