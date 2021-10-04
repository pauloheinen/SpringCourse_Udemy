package com.cursospring.curso.mapper;

import com.cursospring.curso.dto.BookDTO;
import com.cursospring.curso.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Book_Mapper {

    Book_Mapper INSTANCE = Mappers.getMapper(Book_Mapper.class);

    Book toModel(BookDTO bookDTO);

    BookDTO toDTO(Book book);
}
