package com.codegym.demo.service.impl;

import com.codegym.demo.model.Book;
import com.codegym.demo.exception.DuplicateEmailException;
import com.codegym.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl {
    @Autowired
    BookRepository bookRepository;

    
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    
    public Book findById(int id)  {
        Book book = bookRepository.findById(id).orElse(null);
        return book;
    }

    
    public void save(Book book){
            bookRepository.save(book);
    }

    
    public void remove(int id) {
        bookRepository.deleteById(id);
    }

    
    public void update(Book book) {
        bookRepository.save(book);
    }
}
