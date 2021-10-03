package com.cursospring.curso.service;

import com.cursospring.curso.dto.BookDTO;
import com.cursospring.curso.dto.MessageResponseDTO;
import com.cursospring.curso.entity.Book;
import com.cursospring.curso.mapper.Book_Mapper;
import com.cursospring.curso.repository.Book_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service  // class to
public class Book_Service {

    private Book_Repository book_repository;
    private final Book_Mapper book_mapper = Book_Mapper.INSTANCE;

    @Autowired  // injeção de dependencia
    public Book_Service(Book_Repository book_repository) {
        this.book_repository = book_repository;
    }

    public MessageResponseDTO create(BookDTO bookDTO){
        Book  booktosave = book_mapper.toModel(bookDTO);

        Book savedBook = book_repository.save(booktosave);
        return MessageResponseDTO.builder()
                .message("Created Book with ID: " + savedBook.getId())
                .build();

    }
}
