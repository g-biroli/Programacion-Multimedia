package com.example.actividadEvaluable3.services.implementation;

import com.example.actividadEvaluable3.model.Libros;
import com.example.actividadEvaluable3.repository.LibroRepository;
import com.example.actividadEvaluable3.services.LibrosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibrosServicesIMP implements LibrosServices {
    @Autowired
    private LibroRepository libroRepository;

    @Override
    public List<Libros> getAllLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libros addLibro(Libros libros) {
       return libroRepository.save(libros);
    }

    @Override
    public void getTitulo(String titulo) {
        libroRepository.getByTitulo(titulo);
    }
}
