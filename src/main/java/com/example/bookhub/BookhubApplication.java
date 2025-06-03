package com.example.bookhub;

import com.example.bookhub.model.Book;
import com.example.bookhub.service.BookService;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookhubApplication {
    @Autowired
    private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookhubApplication.class, args);
    }

    public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setTitle("Harry Potter and the Sorcerer's Stone");
            book.setAuthor("J. K. Rowling");
            book.setIsbn("9781338878929");
            book.setPrice(BigDecimal.valueOf(300));

            bookService.save(book);

            System.out.println(bookService.getAll());
        };
    }

}
