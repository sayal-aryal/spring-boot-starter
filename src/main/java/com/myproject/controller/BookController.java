package com.myproject.controller;

import com.myproject.model.Book;
import com.myproject.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    BookService bookService;

    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/book")
    private List<Book> getAllBooks() {
        return bookService.getAllBook();
    }

    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/book/{bookid}")
    private Book getBooks(@PathVariable("bookid") int bookid) {
        return bookService.getBookById(bookid);
    }

    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid) {
        bookService.delete(bookid);
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/book")
    private int saveBook(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book.getBookid();
    }

    //creating put mapping that updates the book detail
    @PutMapping("/book")
    private Book update(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book;
    }
}
