
// Crear construtores con nombre y apellido obrigatorio

open class Usuario (var nombre: String, var apellido: String){

    //Si o si el usuario tiene que rellenar con el nombre y apellido
    //Pero algunos usuarios tienen correo o telefono. Entonces vamos crear este constructor

    //Constructores primarios y secundarios (estes con datos distintos) se basan en el primario
    //variables inicializadas + nuevo constructor (secundario) con la base del primer + "inicializacion ?="
    //"?=" Sirve para que la variable no sea obligatoria.

    var correo : String?= null;
    var telefono : Int?= null;
    constructor(nombre: String, apellido: String, correo: String?= null, telefono: Int?= null):this(nombre, apellido){
        this.correo = correo;
        this.telefono = telefono;
    }
    open fun mostrarDatos(){
        println(nombre)
        println(apellido)
        println(correo)
        println(telefono)
    }
}