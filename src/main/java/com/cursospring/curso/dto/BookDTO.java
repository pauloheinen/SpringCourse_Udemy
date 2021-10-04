package com.cursospring.curso.dto;

import com.cursospring.curso.entity.Author;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

// lombok annotations
@Data  // lombok getters and setters
@Builder // automatically produce the code required to have your class be instantiable with code
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private Long id;

    //  those '@' are bean validations
    @NotBlank
    @Size(max = 30)
    private String name;

    @NotNull
    private Integer pages;

    @NotNull
    private Integer chapters;

    @NotBlank
    @Size(max = 10)
    private String isbn;

    @NotBlank
    @Size(max = 30)
    private String publisherName;

    @Valid
    @NotNull
    private Author author;
}
