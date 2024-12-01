package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Empleados {

    private int id;
    private String nombre;
    private String apellidos;
    private String correo;

    public void mostrarDatos(){
        System.out.println("id =" + id);
        System.out.println("Nombre =" + nombre);
        System.out.println("Apellidos =" + apellidos);
        System.out.println("Correo =" + correo);
    }
}
