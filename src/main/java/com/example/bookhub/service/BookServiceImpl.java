package com.example.bookhub.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.bookhub.model.Book;
import com.example.bookhub.repository.BookRepository;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}

