import com.google.gson.Gson;
import model.Usuario;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Que genero quieres ver?");
        String genero = scanner.next();
        System.out.println("Cuantos quieres ver?");
        int resultados = scanner.nextInt();

        // 1. Peticion a una URL
       String urlString = "https://randomuser.me/api/?results=%d&gender=%s";
        try {
            URL url = new URL(String.format(urlString, resultados, genero));
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            // Flujos -> Stream
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String linea = bufferedReader.readLine();
            JSONObject response = new JSONObject(linea);
            JSONArray results = response.getJSONArray("results");
            for ( Object user : results) {
                if (user instanceof JSONObject){
                    String mail = ((JSONObject) user).getString("email");
                    String phone = ((JSONObject) user).getString("phone");
                    String gender = ((JSONObject) user).getString("gender");

                    Gson gson = new Gson();
                    Usuario usuario = gson.fromJson(((JSONObject) user).toString(),Usuario.class);

                    System.out.println(mail);
                    System.out.println(phone);
                    System.out.println(gender);
                }
            }

        } catch (MalformedURLException e) {     //  Excepcion para verificar si el enlace esta bien
            System.out.println("La URL indicada no es valida");
        } catch (IOException e) {               // Excepcion que verifica problemas de entrada o salida.
            System.out.println("Error en la conexion");
        }
        // 2.
        //
    }
}
