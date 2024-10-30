package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Usuario {
    private String nombre, apellido, correo, telefono;

    public Usuario(String apellido, String nombre, String correo, String telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }
}
