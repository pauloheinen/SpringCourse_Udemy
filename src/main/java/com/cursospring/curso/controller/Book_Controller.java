package com.cursospring.curso.controller;

import com.cursospring.curso.dto.BookDTO;
import com.cursospring.curso.dto.MessageResponseDTO;
import com.cursospring.curso.service.Book_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController  // API REST controller
@RequestMapping("/api/v1/books")  // endpoint
public class Book_Controller {

    private Book_Service book_service;

    @Autowired  // dependency injection
    public Book_Controller(Book_Service book_service) {
        this.book_service = book_service;
    }

    @PostMapping  // POST request
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO){
        return book_service.create(bookDTO);
    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id){
        return book_service.findById(id);
    }
}
