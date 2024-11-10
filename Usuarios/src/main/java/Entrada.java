import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Entrada {

    public static void main(String[] args) {

        // 1. Peticion a una URL
       String urlString = "https://randomuser.me/api/?results=50%22";
        try {
            URL url = new URL(urlString);
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
