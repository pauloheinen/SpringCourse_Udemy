package com.cursospring.curso.controller;

import com.cursospring.curso.dto.MessageResponseDTO;
import com.cursospring.curso.entity.Book;
import com.cursospring.curso.service.Book_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // API REST controller
@RequestMapping("/api/v1/books")  // endpoint
public class Book_Controller {

    private Book_Service book_service;

    @Autowired  // dependency injection
    public Book_Controller(Book_Service book_service) {
        this.book_service = book_service;
    }

    @PostMapping  // POST request
    public MessageResponseDTO create(@RequestBody Book book){
        return book_service.create(book);
    }
}
