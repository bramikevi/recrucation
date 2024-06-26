package com.nplusone.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="author")
public class Author {
    @Id
    private Long id;
    private String name;
    @OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
    private List<Book> books;
    // getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> bookEntities) {
        this.books = bookEntities;
    }
}