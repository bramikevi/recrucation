package com.nplusone.repo;

import com.nplusone.entity.Author;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
    
//    @Query("SELECT DISTINCT a FROM Author a LEFT JOIN FETCH a.books")


    // wystapi problem n+1 -> czyli 1 zapytanie select * from author oraz dla kazdego
    // autor ID bedzie pobieranie select * from books where author_id=ID
    // pobieranie Book przez metode getBooks() w klasie Author - wywolanie metody=pobranie z LAZY execution
//    Hibernate: select a1_0.id,a1_0.name from author a1_0
//    Hibernate: select b1_0.author_id,b1_0.id,b1_0.title from book b1_0 where b1_0.author_id=?
//    Hibernate: select b1_0.author_id,b1_0.id,b1_0.title from book b1_0 where b1_0.author_id=?
//    Hibernate: select b1_0.author_id,b1_0.id,b1_0.title from book b1_0 where b1_0.author_id=?
//    Hibernate: select b1_0.author_id,b1_0.id,b1_0.title from book b1_0 where b1_0.author_id=?
//    Hibernate: select b1_0.author_id,b1_0.id,b1_0.title from book b1_0 where b1_0.author_id=?
    @Query("SELECT a FROM Author a")
    List<Author> findAllAuthorsWithBooks(Pageable pageable);

//    rozwiazanie - napisanie JOINA
//    @Query("SELECT DISTINCT a FROM Author a JOIN FETCH a.books")
    // na joiny sa rozne strategie np pobranie ksiazek po id autorow i potem doczepienie do wynikow autorow
}
