package com.example.bookhub.repository;

import java.util.List;
import com.example.bookhub.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}

