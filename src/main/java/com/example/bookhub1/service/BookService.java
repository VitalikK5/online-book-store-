package com.example.bookhub1.service;

import java.util.List;
import com.example.bookhub1.model.Book;

public interface BookService {
    Book save(Book book);

    List<Book> getAll();
}
