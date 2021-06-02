package com.codegym.demo.controller;

import com.codegym.demo.exception.DuplicateEmailException;
import com.codegym.demo.exception.NotFoundCodeRentException;
import com.codegym.demo.model.Book;
import com.codegym.demo.model.BookRent;
import com.codegym.demo.service.impl.BookRentServiceImpl;
import com.codegym.demo.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;

@Controller
public class BookController {
    @Autowired
    BookServiceImpl bookService;
    @Autowired
    BookRentServiceImpl bookRentService;
    @GetMapping(value = "/book")
    public String viewList(Model model){
        model.addAttribute("books",bookService.findAll());
        return "/book/index";
    }
    @GetMapping(value = "/book/{id}/view")
    public String detail(@PathVariable int id,Model model){
        model.addAttribute("book",bookService.findById(id));
        return "/book/view";
    }
    @GetMapping(value="book/{id}/rent")
    public String rentBook(@PathVariable int id, Model model){
        Book newBook = bookService.findById(id);
        newBook.setQuantity(newBook.getQuantity()-1);
        bookService.save(newBook);
        BookRent bookRent = new BookRent();
        bookRent.setBook(newBook);
        //Random code
        int code = (int)(Math.random() * ( 50000 - 10000 )) + 10000;
        bookRent.setCodeRent(code);
        model.addAttribute("code",code);
        bookRentService.save(bookRent);
        return "book/code";
    }
    @PostMapping(value = "/book/return")
    public String bookReturn(@RequestParam int code) throws NotFoundCodeRentException {
        BookRent bookRent = bookRentService.findBookRentByCodeRent(code);
        if(bookRent==null){
            throw new NotFoundCodeRentException();
        }
        Book book = bookRent.getBook();
        book.setQuantity(book.getQuantity()+1);
        bookService.save(book);
        bookRentService.remove(bookRent.getId_bookRent());
        return "redirect:/book";
    }
//    @GetMapping(value = "/book/returnn")
//    public String returnBook(@RequestAttribute int code)  {
//
//    }
    @ExceptionHandler(NotFoundCodeRentException.class)
    public ModelAndView showInputNotAcceptable() {
        return new ModelAndView("customer/inputs-not-acceptable");
    }
}
