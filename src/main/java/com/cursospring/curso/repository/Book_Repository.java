package com.cursospring.curso.repository;

import com.cursospring.curso.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;  // manage database

public interface Book_Repository extends JpaRepository <Book, Long> {
}
