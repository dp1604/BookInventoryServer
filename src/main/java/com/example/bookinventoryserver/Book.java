package com.example.bookinventoryserver;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String isbn;
    private String title;
    private Double price;
    private int inventorycount;

    public Book() {}

    public Book(String isbn, String title, Double price, int inventorycount) {
        this.setIsbn(isbn);
        this.setTitle(title);
        this.setPrice(price);
        this.setInventoryCount(inventorycount);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getInventoryCount() {
        return inventorycount;
    }

    public void setInventoryCount(int inventorycount) {
        this.inventorycount = inventorycount;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", isbn='" + isbn + "'" + ", title='" + title + "'" + ", price='" + price + "'" + ", inventorycount='" + inventorycount + "'" + "}";
    }
}