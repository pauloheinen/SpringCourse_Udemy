package com.cursospring.curso.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data  // lombok getters and setters
@Builder // automatically produce the code required to have your class be instantiable with code
@NoArgsConstructor
@AllArgsConstructor
@Entity  // author class is a entity
public class Author {

    @Id  // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // for every author add, auto increments
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;
}
