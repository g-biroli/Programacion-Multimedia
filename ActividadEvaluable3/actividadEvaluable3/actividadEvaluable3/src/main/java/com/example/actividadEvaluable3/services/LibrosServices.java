package com.example.actividadEvaluable3.services;

import com.example.actividadEvaluable3.model.Libros;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LibrosServices {

    List<Libros> getAllLibros();

    Libros addLibro(Libros libros);

    void getTitulo(String titulo);

}
