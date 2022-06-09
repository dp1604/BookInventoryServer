package com.example.bookinventoryserver;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookInventoryRepository extends JpaRepository<Book, Integer> {
    //List<Book> findByTitleContainingOrContentContaining(String text, String textAgain);
}