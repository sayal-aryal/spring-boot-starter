package com.myproject.service;

import com.myproject.model.Book;
import com.myproject.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    //getting all books record by using the method findaAll() of CrudRepository
    public List<Book> getAllBook()
    {
        List<Book> books = new ArrayList<>();
        bookRepository.findAll().forEach(book1 -> books.add(book1));
        return books;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public Book getBookById(int id)
    {
        return bookRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void saveOrUpdate(Book book)
    {
        bookRepository.save(book);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
        bookRepository.deleteById(id);
    }
    //updating a record
    public void update(Book book, int bookid)
    {
        bookRepository.save(book);
    }
}
