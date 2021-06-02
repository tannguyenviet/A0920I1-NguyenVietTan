package com.codegym.demo.service.impl;

import com.codegym.demo.model.Book;
import com.codegym.demo.model.BookRent;
import com.codegym.demo.exception.DuplicateEmailException;
import com.codegym.demo.repository.BookRentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookRentServiceImpl {
    @Autowired
    BookRentRepository bookRentRepository;

    
    public List<BookRent> findAll() {
        return bookRentRepository.findAll();
    }

    
    public BookRent findById(int id)  {
        BookRent bookRent = bookRentRepository.findById(id).orElse(null);
        return bookRent;
    }

    
    public void save(BookRent bookRent){
            bookRentRepository.save(bookRent);

    }

    public void remove(int id) {
        bookRentRepository.deleteById(id);
    }

    public void update(BookRent bookRent) {
        bookRentRepository.save(bookRent);
    }

    public BookRent findBookRentByCodeRent(int code){
        return bookRentRepository.findBookRentByCodeRent(code);
    }

}
