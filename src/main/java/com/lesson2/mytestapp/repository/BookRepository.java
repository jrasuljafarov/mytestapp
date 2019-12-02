package com.lesson2.mytestapp.repository;

import com.lesson2.mytestapp.model.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository  extends JpaRepository<BookEntity,Integer> {

    BookEntity findById(Long id);

}