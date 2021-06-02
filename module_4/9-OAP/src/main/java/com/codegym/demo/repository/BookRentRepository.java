package com.codegym.demo.repository;

import com.codegym.demo.model.BookRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRentRepository extends JpaRepository<BookRent,Integer> {
    BookRent findBookRentByCodeRent(int code);
}
