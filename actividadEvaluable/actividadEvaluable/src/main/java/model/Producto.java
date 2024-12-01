package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

    @Setter
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor

public class Producto implements Serializable {

    private String nombre;
    private int id;
    private String descripcion;
    private int cantidad;
    private int precio;

        public Producto(String nombre, String descripcion, int id, int precio) {
            this.nombre = nombre;
            this.descripcion = descripcion;
            this.id = id;
            this.precio = precio;
        }


        public void mostrarDatos(){
        System.out.println("id =" + id);
        System.out.println("Nombre =" + nombre);
        System.out.println("Descripcion =" + descripcion);
        System.out.println("Cantidad =" + cantidad);
        System.out.println("Precio =" + precio);
    }
}
