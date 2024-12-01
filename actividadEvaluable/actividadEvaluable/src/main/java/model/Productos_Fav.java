package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor


public class Productos_Fav {

    private int id;
    private int id_producto;

    public void mostrarDatos(){
        System.out.println("id =" + id);
        System.out.println("ID del producto =" + id_producto);
    }
}
