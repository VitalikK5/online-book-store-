package com.example.bookhub.repository;

import com.example.bookhub.model.Book;
import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}

