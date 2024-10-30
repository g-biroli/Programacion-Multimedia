import java.io.File;
import java.io.IOException;

public class GestionFicheros {

    public void trabajoFicherosBase(){
        //File
        File file = new File("src/resources/ejemplo4.txt");
        if (!file.exists()){
            try {
                file.createNewFile();   //Para criar um novo arquivo, é necessario que se ponha dentro de exceção.
                System.out.println(file.getName());
                System.out.println(file.getAbsolutePath());
                System.out.println(file.canRead());
                System.out.println(file.canWrite());
                System.out.println(file.isFile());
                System.out.println(file.isHidden());
            }   catch (IOException e){
                System.out.println("Error al crear el nuevo archivo");
                //test commit
            }
        }
    }


    public void flujoEscritura(String path){
        //File -> FileWriter -> BufferedWriter
        File file = new File(path);

    }
}
