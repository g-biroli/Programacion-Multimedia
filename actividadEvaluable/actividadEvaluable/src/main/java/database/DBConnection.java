package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    //permite llegar a la conexion

    private static Connection connection;

    private void createConnection(){
        String url = "jdbc:mysql://localhost:3306/";
        connection = DriverManager.getConnection();
    }
    public Connection getConnection(){
        if (connection == null){
            createConnection();
        }
        return connection;
    }
}
