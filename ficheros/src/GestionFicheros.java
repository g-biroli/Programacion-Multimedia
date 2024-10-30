import java.io.*;

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

        FileWriter fw = null;
        //BufferedWriter bw = null;
        PrintWriter pw = null;

        //Funcion para escribir dentro del archivo txt
        try {
             //fw = new FileWriter(file, true);
             //fw.write("123\n");
             //fw.write("Esto es otra linea");
             //bw = new BufferedWriter(new FileWriter(file));
             //bw.write("Esto en una linea");
             //bw.newLine();
             //bw.write("Segunda linea");
            pw = new PrintWriter(new FileWriter(file, true));
            pw.println("Esto es una linea en el fichero");
            pw.println("Segunda linea");


        } catch (IOException e) {
            System.out.println("Error en la apertura del fichero");
        }   finally {
            try {
                pw.close();
            } catch (NullPointerException e) {
                System.out.println("Error en el cerrado del fichero");
            }
        }

    }

    public void flujoLectura(String path){
        //File -> FileReader (caracter a caracter) -> BufferedReader (linea a linea)
        File file = new File(path);
        //FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            // fileReader = new FileReader(file);
            // nt numeroASCI = fileReader.read();
            bufferedReader = new BufferedReader(new FileReader(file));
            String linea = null;
            while ((linea= bufferedReader.readLine())!= null){
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {     //Excepción de existir
            System.out.println("El fichero no existe");
        } catch (IOException e) {               //Excepción de permiso
            System.out.println("Error en la lectura");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException | NullPointerException e) {
                System.out.println("Error en el cerrado");
            }
        }

    }

    public void flujoEscrituraObjetos(String path){
        File file = new File(path);
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream(file));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }

    }
}
