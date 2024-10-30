import java.io.Serializable

// extends -> Clases (En Java)
// Implements -> Para las Interfaces
//Mas simples en kotlin a ver abajo
//La clase heredada tiene que ser una clase "OPEN" por que todas las clases en kotlin son final

class UsuarioEspecializado(nombre: String, apellido: String, var nSS: Int) : Usuario(nombre, apellido), Serializable {

    override fun mostrarDatos() {
        super.mostrarDatos()
        println(nSS)
    }
}