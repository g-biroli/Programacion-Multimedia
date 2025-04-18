package com.example.actividadEvaluable3.controller;

import com.example.actividadEvaluable3.model.Libros;
import com.example.actividadEvaluable3.services.LibrosServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libros")
public class LibrosController {
    @Autowired
    private LibrosServices librosServices;

    @GetMapping("/all")
    public ResponseEntity<List<Libros>> getAllLibros(){
        return new ResponseEntity<>(librosServices.getAllLibros(), HttpStatus.OK);
    }
    @GetMapping("/info")
    public String conexionCorrecta(){
        return "Conexion realizada correctamente";
    }
    @PostMapping("/add")
    public ResponseEntity<Libros> agregarLibros(@RequestBody Libros libros){
        return new ResponseEntity<>(librosServices.addLibro(libros), HttpStatus.OK);
    }
    @GetMapping("/error")
    public String error(){
        return "Fallo en la consulta";
    }
}
