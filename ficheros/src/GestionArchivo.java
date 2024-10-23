import java.io.File;

public class GestionArchivo {
    //test commit en github
    //Gestion de archivo
    //Creando el archivo
    //// O path do arquivo é quem determina todo o exercicio. Usar o if para verificar o arquivo e o forEach para pegar o //
    // arquivo e mandar ler os nomes //
    //test
    public void trabajoFicherosArchivo(){
        File archivo = new File("C:\\Users\\Gabriel\\OneDrive\\DEV\\Faculdade DAM (Ano 2)");
        if (!archivo.exists()){
            if (archivo.isDirectory()){
                System.out.println(archivo.getName());
                for (File item : archivo.listFiles()) {
                    System.out.println(item.getName());
              }
            } else {
                System.out.println(archivo.getName());
          }
        }
    }
}
