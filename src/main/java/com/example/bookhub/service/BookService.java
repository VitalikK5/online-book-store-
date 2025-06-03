package com.example.bookhub.service;

import com.example.bookhub.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> getAll();
}
