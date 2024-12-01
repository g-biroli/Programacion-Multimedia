package model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Pedidos {

    private int id;
    private int id_producto;
    private String descripcion;
    private int precio_total;

    public void mostrarDatos(){
        System.out.println("id =" + id);
        System.out.println("ID del Producto =" + id_producto);
        System.out.println("Descripcion =" + descripcion);
        System.out.println("Precio Total =" + precio_total);
    }
}
