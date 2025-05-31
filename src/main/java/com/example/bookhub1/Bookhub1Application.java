package com.example.bookhub1;

import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.bookhub1.model.Book;
import com.example.bookhub1.service.BookService;

@SpringBootApplication
public class Bookhub1Application {
    @Autowired
    private BookService bookService;


    public static void main(String[] args) {
        SpringApplication.run(Bookhub1Application.class, args);
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
