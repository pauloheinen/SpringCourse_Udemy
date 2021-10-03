package com.cursospring.curso.service;

import com.cursospring.curso.dto.MessageResponseDTO;
import com.cursospring.curso.entity.Book;
import com.cursospring.curso.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service  // class to
public class Book_Service {

    private Book_Repository book_repository;

    @Autowired  // injeção de dependencia
    public Book_Service(Book_Repository book_repository) {
        this.book_repository = book_repository;
    }

    public MessageResponseDTO create(Book book){
        Book savedBook = this.book_repository.save(book);
        return MessageResponseDTO.builder()
                .message("Created Book with ID: " + savedBook.getId())
                .build();

    }
}
