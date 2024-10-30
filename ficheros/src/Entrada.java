public class Entrada {


    public static void main(String[] args) {
    GestionFicheros gestionFicheros = new GestionFicheros();
    // gestionFicheros.trabajoFicherosBase();
    gestionFicheros.flujoEscritura("src/resources/ejemplo.txt");
    gestionFicheros.flujoLectura("src/resources/ejemplo.txt");


    }
}
