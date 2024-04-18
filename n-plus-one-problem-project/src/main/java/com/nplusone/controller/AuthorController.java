package com.nplusone.controller;

import com.nplusone.entity.Author;
import com.nplusone.record.AuthorWithBooks;
import com.nplusone.record.BookRecord;
import com.nplusone.repo.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private MyService myService;

    @GetMapping("/authors")
    public List<AuthorWithBooks> getAllAuthorsWithBooks(Pageable pageable) {
        List<Author> authors = authorRepository.findAllAuthorsWithBooks(PageRequest.of(0,5));
        System.out.println(myService.getRedirectUrl());
        return authors.stream()
                .map(author -> new AuthorWithBooks(author.getId(), author.getName(),
                        author.getBooks().stream()
                                .map(book -> new BookRecord(book.getId(), book.getTitle()))
                                .collect(Collectors.toList())))
                .collect(Collectors.toList());
    }
}