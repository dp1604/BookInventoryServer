package com.example.bookinventoryserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bookstore")
public class BookController {

    @Autowired
    BookRepository bookRespository;

    @GetMapping("/book")
    public List<Book> index(){
        return bookRespository.findAll();
    }

    @GetMapping("/book/{id}")
    public Book show(@PathVariable String id){
        int bookId = Integer.parseInt(id);
        return bookRespository.getOne((long) bookId);
    }

    @PostMapping("/book")
    public Book create(@RequestBody Map<String, String> body){
        String isbn = body.get("isbn");
        String title = body.get("title");
        Double price = Double.valueOf(body.get("price"));
        int inventorycount = Integer.parseInt(body.get("inventorycount"));
        return bookRespository.save(new Book(isbn, title, price, inventorycount));
    }

    @PutMapping("/book/{id}")
    public Book update(@PathVariable String id, @RequestBody Map<String, String> body){
        int bookId = Integer.parseInt(id);
        Book book = bookRespository.getOne((long) bookId);
        book.setTitle(body.get("title"));
        book.setIsbn(body.get("isbn"));
        book.setPrice(Double.valueOf(body.get("price")));
        book.setInventoryCount(Integer.parseInt(body.get("setinventorycount")));
        return bookRespository.save(book);
    }

    @DeleteMapping("book/{id}")
    public boolean delete(@PathVariable String id){
        int bookId = Integer.parseInt(id);
        bookRespository.delete(bookRespository.getOne((long) bookId));
        return true;
    }

}