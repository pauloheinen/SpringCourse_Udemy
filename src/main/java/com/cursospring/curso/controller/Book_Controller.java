package com.cursospring.curso.controller;


import com.cursospring.curso.MessageResponseDTO;
import com.cursospring.curso.entity.Book;
import com.cursospring.curso.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // controlador de API REST
@RequestMapping("/api/v1/books")  // endpoint
public class Book_Controller {

    private Book_Repository book_repository;

    @Autowired  // injeção de dependencia
    public Book_Controller(Book_Repository book_repository) {
        this.book_repository = book_repository;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book){
        Book savedBook = this.book_repository.save(book);
        return MessageResponseDTO.builder()
                .message("Created Book with ID: " + savedBook.getId())
                .build();

    }
}
