package com.cursospring.curso.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

// lombok annotations
@Data  // lombok getters and setters
@Builder // automatically produce the code required to have your class be instantiable with code
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Author {

    @Id  // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // for every author add, auto increments
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer age;
}
