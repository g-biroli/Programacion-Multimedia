package com.example.actividadEvaluable3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table (name = "libros")

public class Libros implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String titulo;

    @Column
    private String autor;

    @Column
    private int anio_publicacion;

    @Column
    private String isbn;

    public Libros(String titulo, int id, String autor, int anio_publicacion, String isbn) {
        this.titulo = titulo;
        this.id = id;
        this.autor = autor;
        this.anio_publicacion = anio_publicacion;
        this.isbn = isbn;
    }

    public Libros() {
    }
}
