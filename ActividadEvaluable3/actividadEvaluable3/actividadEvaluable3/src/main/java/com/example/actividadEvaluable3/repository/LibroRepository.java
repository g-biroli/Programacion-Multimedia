package com.example.actividadEvaluable3.repository;

import com.example.actividadEvaluable3.model.Libros;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository <Libros, Integer> {

    Libros getByTitulo(String titulo);
}
