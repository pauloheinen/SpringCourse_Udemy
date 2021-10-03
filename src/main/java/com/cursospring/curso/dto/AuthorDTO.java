package com.cursospring.curso.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


// lombok annotations
@Data  // lombok getters and setters
@Builder // automatically produce the code required to have your class be instantiable with code
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

    private Long id;

    @NotBlank
    @Size(max = 30)
    private String name;

    @NotNull
    @Size(max = 100)
    private Integer age;
}
