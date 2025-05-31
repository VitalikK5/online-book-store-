package com.example.bookhub1.repository;

import java.util.List;
import com.example.bookhub1.model.Book;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}

